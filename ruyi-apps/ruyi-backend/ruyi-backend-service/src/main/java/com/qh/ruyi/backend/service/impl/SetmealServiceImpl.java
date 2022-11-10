package com.qh.ruyi.backend.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qh.ruyi.backend.converter.SetmealConverter;
import com.qh.ruyi.backend.mapper.CategoryMapper;
import com.qh.ruyi.backend.mapper.SetmealDishMapper;
import com.qh.ruyi.backend.mapper.SetmealMapper;
import com.qh.ruyi.backend.service.SetmealDishService;
import com.qh.ruyi.backend.service.SetmealService;
import com.qh.ruyi.dto.SetmealDto;
import com.qh.ruyi.entity.Category;
import com.qh.ruyi.entity.Setmeal;
import com.qh.ruyi.entity.SetmealDish;
import com.qh.ruyi.exception.CustomException;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@DubboService(interfaceClass = SetmealService.class)
public class SetmealServiceImpl implements SetmealService {
    @Autowired
    private SetmealMapper setmealMapper;
    @Autowired
    private SetmealDishService setmealDishService;
    @Autowired
    private CategoryMapper categoryMapper;
    @Autowired
    private SetmealDishMapper setmealDishMapper;

    /**
     * 新增套餐，同时需要保存套餐和菜品的关联关系
     *
     * @param setmealDto
     */
    @Transactional
    @Override
    public Boolean saveWithDish(SetmealDto setmealDto) {
        try {
            //保存套餐的基本信息，操作setmeal，执行insert操作
            setmealMapper.insert(setmealDto);

            List<SetmealDish> setmealDishes = setmealDto.getSetmealDishes();
            setmealDishes = setmealDishes.stream().peek((item) -> item.setSetmealId(setmealDto.getId())).collect(Collectors.toList());
            //保存套餐和菜品的关联信息，操作setmeal_dish,执行insert操作
            setmealDishService.saveBatch(setmealDishes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public Page<SetmealDto> page(int page, int pageSize, String name) {
        //分页构造器对象
        Page<Setmeal> pageInfo = new Page<>(page, pageSize);
        Page<SetmealDto> dtoPage = new Page<>();

        LambdaQueryWrapper<Setmeal> queryWrapper = new LambdaQueryWrapper<>();
        //添加查询条件，根据name进行like模糊查询
        queryWrapper.like(name != null, Setmeal::getName, name);
        //添加排序条件，根据更新时间降序排列
        queryWrapper.orderByDesc(Setmeal::getUpdateTime);

        setmealMapper.selectPage(pageInfo, queryWrapper);

        //对象拷贝
        BeanUtils.copyProperties(pageInfo, dtoPage, "records");
        List<Setmeal> records = pageInfo.getRecords();

        List<SetmealDto> list = records.stream().map((item) -> {
            SetmealDto setmealDto = new SetmealDto();
            //对象拷贝
            BeanUtils.copyProperties(item, setmealDto);
            //分类id
            Long categoryId = item.getCategoryId();
            //根据分类id查询分类对象
            Category category = categoryMapper.selectById(categoryId);
            if (category != null) {
                //分类名称
                String categoryName = category.getName();
                setmealDto.setCategoryName(categoryName);
            }
            return setmealDto;
        }).collect(Collectors.toList());

        dtoPage.setRecords(list);
        return dtoPage;
    }

    /**
     * 删除套餐，同时需要删除套餐和菜品的关联数据
     *
     * @param ids
     */
    @Override
    @Transactional
    public Boolean removeWithDish(List<Long> ids) {
        //select count(*) from setmeal where id in (1,2,3) and status = 1
        //查询套餐状态，确定是否可用删除
        LambdaQueryWrapper<Setmeal> queryWrapper = new LambdaQueryWrapper();
        queryWrapper.in(Setmeal::getId, ids);
        queryWrapper.eq(Setmeal::getStatus, 1);

        Long count = setmealMapper.selectCount(queryWrapper);
        if (count > 0) {
            throw new CustomException("套餐正在售卖中，不能删除");
        }

        //如果可以删除，先删除套餐表中的数据---setmeal
        setmealMapper.deleteBatchIds(ids);
        //delete from setmeal_dish where setmeal_id in (1,2,3)
        LambdaQueryWrapper<SetmealDish> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.in(SetmealDish::getSetmealId, ids);
        //删除关系表中的数据----setmeal_dish
        setmealDishMapper.delete(lambdaQueryWrapper);

        return true;
    }

    @Override
    public List<SetmealDto> list(SetmealDto setmealDto) {
        Setmeal setmeal = SetmealConverter.INSTANCE.dto2Entity(setmealDto);
        LambdaQueryWrapper<Setmeal> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(setmeal.getCategoryId() != null, Setmeal::getCategoryId, setmeal.getCategoryId());
        queryWrapper.eq(setmeal.getStatus() != null, Setmeal::getStatus, setmeal.getStatus());
        queryWrapper.orderByDesc(Setmeal::getUpdateTime);

        List<Setmeal> setmeals = setmealMapper.selectList(queryWrapper);
        return SetmealConverter.INSTANCE.entity2Dto4List(setmeals);
    }
}
