package com.employee.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.management.entity.Employee;
import com.employee.management.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class ListEmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/list")
	public List<Employee> listEmp() {
		return employeeService.listAllEmployee();
	}
}
