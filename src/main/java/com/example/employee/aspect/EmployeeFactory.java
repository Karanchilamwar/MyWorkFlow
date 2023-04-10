package com.example.employee.aspect;

import com.example.employee.dto.EmployeeListResult;
import com.example.employee.enums.Feature;
import com.example.employee.annotation.FeatureFlag;
import com.example.employee.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@AllArgsConstructor
public class EmployeeFactory {

    private final Map<String, EmployeeService> employeeServiceMap;

    public EmployeeService getStrategy(EmployeeListResult  employeeListResult) {

//        if(featureFlag.feature().equals(Feature.CONTRACTOR_EMP)){
//             return employeeServiceMap.get(Feature.Names.CONTRACTOR_EMP);
//        }
//        else if(featureFlag.feature().equals(Feature.PERMANENT_EMP)){
//            return employeeServiceMap.get(Feature.Names.PERMANENT_EMP);
//        }
        return   new EmployeeService();
    }

}
