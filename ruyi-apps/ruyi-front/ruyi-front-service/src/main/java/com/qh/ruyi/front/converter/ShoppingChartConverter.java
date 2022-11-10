package com.qh.ruyi.front.converter;

import com.qh.ruyi.converter.BaseConverter;
import com.qh.ruyi.dto.ShoppingCartDto;
import com.qh.ruyi.entity.ShoppingCart;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ShoppingChartConverter extends BaseConverter<ShoppingCart, ShoppingCartDto> {
    ShoppingChartConverter INSTANCE = Mappers.getMapper(ShoppingChartConverter.class);
}
