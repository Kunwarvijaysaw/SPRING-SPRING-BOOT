package com.kvs.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kvs.main.entity.Employee;
import com.kvs.main.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service
public  class EmployeeService {

	
	@Autowired
    private EmployeeRepository repo;

    // Save employee
    public void save(Employee e) {
        repo.save(e);
    }

    // Get all employees
    public Iterable<Employee> getAll() {
        return repo.findAll();
    }

    // Get by department
    public List<Employee> getByDepartment(String dept) {
        return repo.findByDepartment(dept);
    }

    // Get by salary
    public List<Employee> getBySalaryGreaterThan(Double salary) {
        return repo.findBySalaryGreaterThan(salary);
    }

    // Update salary

    public void updateSalary(Long id, Double salary) {
        repo.updateSalaryById(id, salary);
    }

    // Delete by name
   
    public void deleteByName(String name) {
        repo.deleteByName(name);
    }
}