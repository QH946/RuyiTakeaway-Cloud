package com.qh.ruyi.backend.converter;

import com.qh.ruyi.converter.BaseConverter;
import com.qh.ruyi.dto.DishDto;
import com.qh.ruyi.entity.Dish;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DishConverter extends BaseConverter<Dish, DishDto> {
    DishConverter INSTANCE = Mappers.getMapper(DishConverter.class);
}
