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
		SpringApplication.run(EmsApplication.class, args);
//		WebController controller = container.getBean(WebController.class);
//		controller.getAllEmployees();



	}

}
