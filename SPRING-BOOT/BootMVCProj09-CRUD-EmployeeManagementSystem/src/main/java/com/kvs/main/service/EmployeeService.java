package com.kvs.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kvs.main.entity.Employee;
import com.kvs.main.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository empRepo;
	
	public void addEmployee(Employee e) {
		empRepo.save(e);
	}

	public List<Employee> getAllEmployees(){
		return empRepo.findAll();
	}

	public Optional<Employee> getEmployeeById(int id) {
		return empRepo.findById(id);
		
	}

	public  void updateEmployee(Employee e) {
		empRepo.save(e);
	}

	public void deleteEmployee(int id) {
		empRepo.deleteById(id);
	}


}
