package com.qh.ruyi.backend.service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qh.ruyi.dto.EmployeeDto;
import com.qh.ruyi.entity.Employee;

public interface EmployeeService{
        EmployeeDto getEmployeeByCondition(EmployeeDto employeeDto);
        Boolean save(EmployeeDto employeeDto);
        Page<Employee> page(int page, int pageSize, String name);
        Boolean updateEmployeeByCondition(EmployeeDto employeeDto);
}
