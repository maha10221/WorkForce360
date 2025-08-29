package com.example.dto;

import lombok.Data;

@Data
public class EmployeeDTO {
    private String id;
    private String name;
    private String age;
    private String yearOfJoin;
    private String gender;
    private String bloodGroup;
    private Integer deptId; // use Integer, not int
}
