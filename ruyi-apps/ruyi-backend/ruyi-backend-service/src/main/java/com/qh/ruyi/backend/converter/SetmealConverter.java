package com.qh.ruyi.backend.converter;

import com.qh.ruyi.converter.BaseConverter;
import com.qh.ruyi.dto.SetmealDto;
import com.qh.ruyi.entity.Setmeal;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SetmealConverter extends BaseConverter<Setmeal, SetmealDto> {
    SetmealConverter INSTANCE = Mappers.getMapper(SetmealConverter.class);
}
