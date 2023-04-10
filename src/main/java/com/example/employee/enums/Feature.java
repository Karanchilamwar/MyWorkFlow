package com.example.employee.enums;

import lombok.AllArgsConstructor;

public enum Feature {

    PERMANENT_EMP("PERMANENT_EMP"),
    CONTRACTOR_EMP("CONTRACTOR_EMP");

    private String name;
    Feature(String name){
        this.name=name;
    }

    public static class Names{
        public static final String PERMANENT_EMP="PERMANENT";
        public static final String CONTRACTOR_EMP="CONTRACTOR";
    }

}
