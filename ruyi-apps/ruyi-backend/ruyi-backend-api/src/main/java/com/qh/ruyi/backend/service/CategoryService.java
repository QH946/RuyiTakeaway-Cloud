package com.qh.ruyi.backend.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qh.ruyi.dto.CategoryDto;
import com.qh.ruyi.entity.Category;

import java.util.List;

public interface CategoryService {
    boolean save(CategoryDto categoryDto);

    Page<Category> page(int page, int pageSize);
    boolean remove(Long id);

    Boolean updateById(CategoryDto categoryDto);

    List<CategoryDto> list(CategoryDto categoryDto);
}
