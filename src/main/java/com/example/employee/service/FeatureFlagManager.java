package com.example.employee.service;

import com.example.employee.enums.Feature;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class FeatureFlagManager{

    private static Map<Feature,Boolean> featureFlagsState;

    FeatureFlagManager(){
        featureFlagsState=new HashMap<>();
        featureFlagsState.put(Feature.PERMANENT_EMP,true);
        featureFlagsState.put(Feature.CONTRACTOR_EMP,false);
    }

    public static boolean isEnabled(Feature feature){
        return feature.equals(Feature.CONTRACTOR_EMP)?true:false;
    }

}
