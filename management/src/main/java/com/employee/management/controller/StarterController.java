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
public class StarterController {
	
	@GetMapping("/")
	public String onStart() {
		return ("<h1> RestAPI Assignment with Great Learning </h1>");
	}

}
