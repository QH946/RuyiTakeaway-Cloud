package com.qh.ruyi.front.converter;


import com.qh.ruyi.converter.BaseConverter;
import com.qh.ruyi.dto.OrdersDto;
import com.qh.ruyi.entity.Orders;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrdersConverter extends BaseConverter<Orders, OrdersDto> {
    OrdersConverter INSTANCE = Mappers.getMapper(OrdersConverter.class);
}
