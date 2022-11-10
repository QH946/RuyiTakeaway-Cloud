package com.qh.ruyi.backend.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qh.ruyi.dto.DishDto;

import java.util.List;

public interface DishService {
    Boolean saveWithFlavor(DishDto dishDto);

    Page<DishDto> page(int page, int pageSize, String name);

    DishDto getByIdWithFlavor(Long id);

    Boolean updateWithFlavor(DishDto dishDto);

    List<DishDto> list(DishDto dishDto);
}
