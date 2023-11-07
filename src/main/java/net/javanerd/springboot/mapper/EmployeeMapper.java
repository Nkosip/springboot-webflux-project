package net.javanerd.springboot.mapper;

import net.javanerd.springboot.dto.EmployeeDto;
import net.javanerd.springboot.entity.Employee;
import org.springframework.beans.BeanUtils;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee) {
        EmployeeDto employeeDto = new EmployeeDto();
        BeanUtils.copyProperties(employee,employeeDto);
        return employeeDto;
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeDto,employee);
        return employee;
    }
}
