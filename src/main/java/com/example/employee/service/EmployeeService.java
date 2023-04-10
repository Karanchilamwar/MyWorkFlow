package com.example.employee.service;

import com.example.employee.enums.Feature;
import com.example.employee.annotation.FeatureFlag;
import com.example.employee.dto.Employee;
import com.example.employee.dto.EmployeeListResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class EmployeeService implements IEmployeeService {

    private static final List<Employee> employees = List.of(
            new Employee(1,"Spider","Man","CEO","PERMANENT"),
            new Employee(2,"Jack","Jill","CTO","CONTRACTOR"),
            new Employee(3,"Micky","Mouse","Architect","PERMANENT"),
            new Employee(4,"Tom","Tommy","SCM", "CONTRACTOR"),
            new Employee(5,"Jerry","The Cat","PM","PERMANENT"),
            new Employee(6,"Pokemaon","The cartoon","PO","CONTRACTOR")
            );

    @Override
    @FeatureFlag(feature = Feature.CONTRACTOR_EMP, returnType = EmployeeListResult.class)
    public EmployeeListResult getListOfEmployees()
    {
        return new EmployeeListResult(employees, 0);
    }

    @Override
    public Optional<Employee> getEmployeeById(long id)
    {
        return employees.stream().filter(employee -> employee.getEmployeeId()==id)
                .findFirst();
    }
}
