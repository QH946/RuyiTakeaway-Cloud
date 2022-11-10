package com.qh.ruyi.backend.service.impl;

import com.qh.ruyi.backend.mapper.DishFlavorMapper;
import com.qh.ruyi.backend.service.DishFlavorService;
import com.qh.ruyi.entity.DishFlavor;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@DubboService(interfaceClass = DishFlavorService.class)
public class DishFlavorServiceImpl implements DishFlavorService{
    @Autowired
    private DishFlavorMapper dishFlavorMapper;
    @Override
    public Boolean saveBatch(List<DishFlavor> flavors) {
        try {
            for (DishFlavor flavor : flavors) {
                dishFlavorMapper.insert(flavor);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
}
