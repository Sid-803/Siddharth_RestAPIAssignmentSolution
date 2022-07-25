package com.employee.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.employee.management.entity.Employee;
import com.employee.management.repository.EmployeeRepo;

@RestController
public class SortBy {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@GetMapping("employees/sort")
	public List<Employee> SortByFirstName() {
		List<Employee> employee = employeeRepo.findAll(Sort.by(Sort.Direction.ASC, "firstName"));
		return employee;
	}
}
