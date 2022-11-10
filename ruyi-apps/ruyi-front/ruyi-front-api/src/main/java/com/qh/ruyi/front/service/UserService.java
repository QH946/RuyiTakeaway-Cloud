package com.qh.ruyi.front.service;

import com.qh.ruyi.dto.UserDto;
public interface UserService {
    String getCurrentId();

    UserDto getUserByCondition(UserDto userDto);

    Long save(UserDto user);

}
