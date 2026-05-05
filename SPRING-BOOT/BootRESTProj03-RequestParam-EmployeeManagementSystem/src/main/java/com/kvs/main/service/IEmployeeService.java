package com.kvs.main.service;

import java.util.List;
import java.util.Optional;

import org.jspecify.annotations.Nullable;

import com.kvs.main.entity.Employee;

public interface IEmployeeService {
	
	@Nullable Employee saveEmployee(Employee e);

	List<Employee> getAllEmployees();

	Optional<Employee> getEmployeeById(Long id);

	String updateEmployee(Long id, Employee e);

	String deleteEmployee(Long id);


}
