package com.employee.management.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.employee.management.entity.Employee;
import com.employee.management.repository.EmployeeRepo;
import com.employee.management.serviceImpl.EmployeeServiceImpl;

@RestController
public class ListByFirstName {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@GetMapping("employees/search/{firstName}")
	public List<Employee> listByFirstName(@PathVariable String firstName) {
		return employeeRepo.findByFirstName(firstName);
	}

}
