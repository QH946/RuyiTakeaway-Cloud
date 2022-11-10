package com.qh.ruyi.front.converter;

import com.qh.ruyi.converter.BaseConverter;
import com.qh.ruyi.dto.UserDto;
import com.qh.ruyi.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserConverter extends BaseConverter<User, UserDto> {
    UserConverter INSTANCE = Mappers.getMapper(UserConverter.class);
}
