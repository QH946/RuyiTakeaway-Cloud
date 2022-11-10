package com.qh.ruyi.backend.service.impl;

import com.qh.ruyi.backend.mapper.SetmealDishMapper;
import com.qh.ruyi.backend.service.SetmealDishService;
import com.qh.ruyi.entity.SetmealDish;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@DubboService(interfaceClass = SetmealDishService.class)
public class SetmealDishImpl implements SetmealDishService {
    @Autowired
    private SetmealDishMapper setmealDishMapper;
    @Override
    public Boolean saveBatch(List<SetmealDish> setmealDishes) {
        try {
            for (SetmealDish setmealDish : setmealDishes) {
                setmealDishMapper.insert(setmealDish);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
}
