package com.candidjava;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.candidjava.spring.bean.Employee;
import com.candidjava.spring.service.EmployeeService;
import com.candidjava.spring.service.EmployeeServiceImp;



@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		
		double max=0;
		Employee employee1=new Employee();
		EmployeeService employeeService=new EmployeeServiceImp();
		for(Employee employee:employeeService.getEmployee()) {
			if(max <employee.getSalary()) {
				max=employee.getSalary();
				employee1=employee;
				
			}
		}
		System.out.println(max);
		System.out.println(employee1);
		
	}

	

}
