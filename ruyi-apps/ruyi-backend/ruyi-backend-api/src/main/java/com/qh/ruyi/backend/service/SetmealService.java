package com.qh.ruyi.backend.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qh.ruyi.dto.SetmealDto;

import java.util.List;

public interface SetmealService {

    Boolean saveWithDish(SetmealDto setmealDto);

    Page<SetmealDto> page(int page, int pageSize, String name);

    Boolean removeWithDish(List<Long> ids);

    List<SetmealDto> list(SetmealDto setmealDto);
}
