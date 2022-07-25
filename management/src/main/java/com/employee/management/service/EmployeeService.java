package com.employee.management.service;

import java.util.List;
import java.util.Optional;

import com.employee.management.entity.Employee;
import com.employee.management.repository.EmployeeRepo;

public interface EmployeeService {

	public List<Employee> listAllEmployee();

	public Optional<Employee> listEmployeeById(int theId);

	public void DeleteEmployeeById(int theId);

	public void saveEmployee(Employee employee);
	
	public Employee update(Employee emp, int id);

}
