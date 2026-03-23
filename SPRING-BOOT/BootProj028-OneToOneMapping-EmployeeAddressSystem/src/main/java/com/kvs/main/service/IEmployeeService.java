package com.kvs.main.service;


import java.util.Optional;

import com.kvs.main.entity.Employee;

public interface IEmployeeService {
	void saveEmployeeWithAddress(Employee employee);

	 Optional<Employee> getEmployeeDetails(Long id);

}
