package com.example.service;

import com.example.entity.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {
    public void saveEmployee(Employee emp);
    public List<Employee> allEmployess();

}
