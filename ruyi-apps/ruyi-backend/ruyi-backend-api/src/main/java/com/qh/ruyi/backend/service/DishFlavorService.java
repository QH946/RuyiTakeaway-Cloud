package com.qh.ruyi.backend.service;

import com.qh.ruyi.entity.DishFlavor;

import java.util.List;

public interface DishFlavorService {
    Boolean saveBatch(List<DishFlavor> flavors);
}
