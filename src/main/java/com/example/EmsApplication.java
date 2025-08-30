package com.example;

import com.example.controller.WebController;
import com.example.entity.Department;
import com.example.entity.Employee;
import com.example.serviceimplimentation.DepartmentDAO;
import com.example.serviceimplimentation.EmployeeDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class EmsApplication {
	public static void main(String[] args) {
		ApplicationContext container = SpringApplication.run(EmsApplication.class, args);
////		WebController controller = container.getBean(WebController.class);
////		controller.getAllEmployees();
//		DepartmentDAO d = container.getBean(DepartmentDAO.class);
//		Department dept = container.getBean(Department.class);
//		Department dept1 = container.getBean(Department.class);
//		Department dept2 = container.getBean(Department.class);
//		Department dept3 = container.getBean(Department.class);
//		dept.setName("Development");
//		dept1.setName("HR");
//		dept2.setName("Design");
//		dept3.setName("Accounts");
//		d.saveDepartment(dept);
//		d.saveDepartment(dept1);
//		d.saveDepartment(dept2);
//		d.saveDepartment(dept3);



	}

}
