package com.example.employee.aspect;

import com.example.employee.annotation.FeatureFlag;
import com.example.employee.dto.EmployeeListResult;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class FeatureFlagAspect {


    @AfterReturning(value = "@annotation(featureFlag)",returning = "result")
    public void manageFeatureFlag(final JoinPoint joinPoint, final FeatureFlag featureFlag, final EmployeeListResult result){
        result.getEmployees();
    }
}
