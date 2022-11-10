package com.qh.ruyi.backend.converter;

import com.qh.ruyi.dto.EmployeeDto;
import com.qh.ruyi.entity.Employee;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-09T15:43:18+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_351 (Oracle Corporation)"
)
public class EmployeeConverterImpl implements EmployeeConverter {

    @Override
    public Employee dto2Entity(EmployeeDto employeeDto) {
        if ( employeeDto == null ) {
            return null;
        }

        Employee employee = new Employee();

        employee.setId( employeeDto.getId() );
        employee.setUsername( employeeDto.getUsername() );
        employee.setName( employeeDto.getName() );
        employee.setPassword( employeeDto.getPassword() );
        employee.setPhone( employeeDto.getPhone() );
        employee.setSex( employeeDto.getSex() );
        employee.setIdNumber( employeeDto.getIdNumber() );
        employee.setStatus( employeeDto.getStatus() );
        employee.setCreateTime( employeeDto.getCreateTime() );
        employee.setUpdateTime( employeeDto.getUpdateTime() );
        employee.setCreateUser( employeeDto.getCreateUser() );
        employee.setUpdateUser( employeeDto.getUpdateUser() );

        return employee;
    }

    @Override
    public EmployeeDto entity2Dto(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        EmployeeDto employeeDto = new EmployeeDto();

        employeeDto.setId( employee.getId() );
        employeeDto.setUsername( employee.getUsername() );
        employeeDto.setName( employee.getName() );
        employeeDto.setPassword( employee.getPassword() );
        employeeDto.setPhone( employee.getPhone() );
        employeeDto.setSex( employee.getSex() );
        employeeDto.setIdNumber( employee.getIdNumber() );
        employeeDto.setStatus( employee.getStatus() );
        employeeDto.setCreateTime( employee.getCreateTime() );
        employeeDto.setUpdateTime( employee.getUpdateTime() );
        employeeDto.setCreateUser( employee.getCreateUser() );
        employeeDto.setUpdateUser( employee.getUpdateUser() );

        return employeeDto;
    }
}
