package com.qh.ruyi.backend.converter;

import com.qh.ruyi.converter.BaseConverter;
import com.qh.ruyi.dto.CategoryDto;
import com.qh.ruyi.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryConverter extends BaseConverter<Category, CategoryDto> {
    CategoryConverter INSTANCE = Mappers.getMapper(CategoryConverter.class);
}
