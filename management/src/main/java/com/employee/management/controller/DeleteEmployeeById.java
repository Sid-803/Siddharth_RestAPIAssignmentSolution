package com.employee.management.controller;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.employee.management.entity.Employee;
import com.employee.management.serviceImpl.EmployeeServiceImpl;

@RestController
public class DeleteEmployeeById {
	
	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;

	@DeleteMapping("employees/{id}")
	public void deleteById(@PathVariable int id) {
		employeeServiceImpl.DeleteEmployeeById(id);
	}

}
