package com.employee.management.serviceImpl;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.context.WebServerApplicationContext;
import org.springframework.boot.web.embedded.tomcat.TomcatWebServer;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.employee.management.entity.Employee;
import com.employee.management.repository.EmployeeRepo;
import com.employee.management.service.EmployeeService;
import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import com.fasterxml.jackson.databind.node.ObjectNode;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public List<Employee> listAllEmployee() {
		return employeeRepo.findAll();

	}

	@Override
	public Optional<Employee> listEmployeeById(int theId) {
		return employeeRepo.findById(theId);

	}

	@Override
	public void DeleteEmployeeById(int theId) {
		employeeRepo.deleteById(theId);

	}

	@Override
	public void saveEmployee(Employee employee) {
		employeeRepo.save(employee);
		employeeRepo.flush();
	}
	
	@Override
	public Employee update(Employee emp, int id) {
		Optional<Employee> empTemp = employeeRepo.findById(id);
		Employee employee = empTemp.get();
		// employee.setId(emp.getId());
		employee.setEmail(emp.getEmail());
		employee.setFirstName(emp.getFirstName());
		employee.setLastName(emp.getLastName());
		employeeRepo.save(emp);
		return employee;

	}
}
