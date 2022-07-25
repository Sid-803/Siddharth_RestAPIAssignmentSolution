package com.employee.management.controller;

import java.io.IOException;
import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.core.env.Environment;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.management.entity.Employee;
import com.employee.management.repository.EmployeeRepo;
import com.employee.management.serviceImpl.EmployeeServiceImpl;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;

@RestController
@RequestMapping("/employees/update")
public class UpdateJson {

	@Autowired
	private EmployeeRepo employeeRepo;

	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;

	@PostMapping(value = "/{employeeId}")
	public Employee update(@RequestBody Employee employee, @PathVariable("employeeId") int employeeId) {

		return employeeServiceImpl.update(employee, employeeId);

	}
}
