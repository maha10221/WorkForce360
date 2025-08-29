package com.example.service;

import com.example.entity.Department;
import com.example.entity.Employee;

import java.util.List;

public interface DepartmentService {
    public void saveDepartment(Department d);
    public List<Department> allDepartments();
}
