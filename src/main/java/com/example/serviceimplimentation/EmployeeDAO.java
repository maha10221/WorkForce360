package com.example.serviceimplimentation;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;
import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeDAO implements EmployeeService {
    @Autowired
    private EmployeeRepository empRepo;
    @Override
    public void saveEmployee(Employee emp){
        empRepo.save(emp);

    }
    @Override
    public List<Employee> allEmployess(){
        return empRepo.findAll();
    }
}

