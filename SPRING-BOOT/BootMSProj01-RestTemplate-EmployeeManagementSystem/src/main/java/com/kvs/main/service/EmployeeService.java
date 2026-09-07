package com.kvs.main.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
	public Employee saveEmployee(Employee e) {
		Employee data = empRepo.save(e);
	return data;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> list=empRepo.findAll();
		// empRepo.findAll().forEach(System.out::println);
		return list;
	}

	@Override
	public Optional<Employee> getEmployeeById(Long id) {
		return empRepo.findById(id);
	}

	@Override
	public String updateEmployee(Long id, Employee e) {
		Employee byId = empRepo.getById(id);
		if (byId != null) {
			byId.setDept(e.getDept());
			byId.setName(e.getName());
			byId.setSalary(e.getSalary());
			empRepo.save(byId);
			return "Employee Updated Succesfully";
		}

		return "Employee not found......";
	}

	@Override
	public String deleteEmployee(Long id) {
		Optional<Employee> byId = empRepo.findById(id);
		if (byId.isPresent()) {
			empRepo.deleteById(id);
			return "Employee deleted Succesfully........";
		}
		return "Emplyee not found";

	}

}
