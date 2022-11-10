package com.qh.ruyi.backend.service;

import com.qh.ruyi.entity.SetmealDish;

import java.util.List;

public interface SetmealDishService {
    Boolean saveBatch(List<SetmealDish> setmealDishes);
}
