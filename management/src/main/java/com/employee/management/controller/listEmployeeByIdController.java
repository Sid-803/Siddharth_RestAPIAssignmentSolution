package com.employee.management.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.employee.management.entity.Employee;
import com.employee.management.serviceImpl.EmployeeServiceImpl;

@RestController
public class listEmployeeByIdController {

	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;

	@GetMapping("employees/{id}")
	public Optional<Employee> listById(@PathVariable int id) {
		return employeeServiceImpl.listEmployeeById(id);
	}
}
