package com.employee.management.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.employee.management.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	List<Employee> findByFirstName(String firstName);
	
	@Query("FROM Employee ORDER BY firstName ASC")
    List<Employee> findAllOrderByFirstNameAsc();
}
