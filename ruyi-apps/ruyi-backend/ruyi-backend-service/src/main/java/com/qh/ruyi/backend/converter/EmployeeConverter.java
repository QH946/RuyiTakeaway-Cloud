package com.qh.ruyi.backend.converter;

import com.qh.ruyi.dto.EmployeeDto;
import com.qh.ruyi.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeConverter {
    EmployeeConverter INSTANCE = Mappers.getMapper(EmployeeConverter.class);

    Employee dto2Entity(EmployeeDto employeeDto);

    EmployeeDto entity2Dto(Employee employee);
}
