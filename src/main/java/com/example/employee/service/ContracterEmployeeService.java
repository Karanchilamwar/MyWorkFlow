package com.example.employee.service;

import com.example.employee.enums.Feature;
import com.example.employee.dto.EmployeeListResult;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component(Feature.Names.CONTRACTOR_EMP)
public class ContracterEmployeeService extends EmployeeService{
    @Override
    public EmployeeListResult getListOfEmployees() {

        EmployeeListResult employeeListResult= super.getListOfEmployees();
        employeeListResult.setEmployees(employeeListResult.getEmployees().stream().filter(emp->emp.getEmployeeType().equals(Feature.Names.CONTRACTOR_EMP)).collect(Collectors.toList()));
        return employeeListResult;
    }
}
