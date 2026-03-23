package com.kvs.main.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kvs.main.entity.Employee;
import com.kvs.main.repository.EmployeeRepository;
@Service
public class EmployeeService implements IEmployeeService {
	
	@Autowired
	EmployeeRepository empRepo;

	@Override
	public void saveEmployeeWithAddress(Employee employee) {
		empRepo.save(employee);
		
	}

	@Override
	public Optional<Employee> getEmployeeDetails(Long id) {
		return empRepo.findById(id);
	}

	


	

	

}
