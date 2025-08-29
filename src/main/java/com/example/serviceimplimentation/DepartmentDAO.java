package com.example.serviceimplimentation;

import com.example.entity.Department;
import com.example.entity.Employee;
import com.example.repository.DepartmentRepository;
import com.example.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentDAO implements DepartmentService {
    @Autowired
    private DepartmentRepository dRepo;
    @Override
    public void saveDepartment(Department d){
        dRepo.save(d);
    }
    @Override
    public List<Department> allDepartments(){
        return dRepo.findAll();
    }
}
