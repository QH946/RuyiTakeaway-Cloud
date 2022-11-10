package com.qh.ruyi.authority.biz.service.auth;

import com.qh.ruyi.base.R;
import com.qh.ruyi.dto.UserDto;

public interface UserLoginService {
    R<UserDto> login(UserDto userDto);
}
