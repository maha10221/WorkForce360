package com.example.controller;

import com.example.dto.EmployeeDTO;
import com.example.entity.Department;
import com.example.entity.Employee;
import com.example.service.DepartmentService;
import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/WorkForce360")
public class WebController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DepartmentService departmentService;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("employeeDTO", new EmployeeDTO());
        model.addAttribute("employees", employeeService.allEmployess());
        model.addAttribute("departments", departmentService.allDepartments());
        return "index";
    }

    @PostMapping("/add")
    public String postEmployee(@ModelAttribute EmployeeDTO employeeDTO) {

        // Convert DTO to Entity
        Employee employee = new Employee();
        employee.setId(employeeDTO.getId());
        employee.setName(employeeDTO.getName());
        employee.setAge(employeeDTO.getAge());
        employee.setYearOfJoin(employeeDTO.getYearOfJoin());
        employee.setGender(employeeDTO.getGender());
        employee.setBloodGroup(employeeDTO.getBloodGroup());

        // Set Department using deptId
        if (employeeDTO.getDeptId() != 0) {
            Department dept = departmentService.allDepartments()
                    .stream()
                    .filter(d -> d.getId() == employeeDTO.getDeptId())
                    .findFirst()
                    .orElse(null);
            employee.setDept(dept);
        }

        employeeService.saveEmployee(employee);
        return "redirect:/WorkForce360";
    }
}
