package com.employee.management.serviceImpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.management.entity.Employee;
import com.employee.management.repository.EmployeeRepo;
import com.employee.management.service.EmployeeService;
import java.util.List;

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

}
