package com.qh.ruyi.authority.biz.service.auth;

import com.qh.ruyi.base.R;
import com.qh.ruyi.dto.EmployeeDto;

public interface EmployeeLoginService {
    R<EmployeeDto> login(EmployeeDto employeeDto);
}
