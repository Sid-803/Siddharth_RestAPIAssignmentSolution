package com.employee.management.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.management.entity.Employee;
import com.employee.management.serviceImpl.EmployeeServiceImpl;

@RestController
@RequestMapping("/employees")
public class SaveEmployeeController {

	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;

	@PostMapping("/save")
	public Employee saveEmp(Employee employee) {
		employeeServiceImpl.saveEmployee(employee);
		return employee;
	}

}
