package com.qh.ruyi.backend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qh.ruyi.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
