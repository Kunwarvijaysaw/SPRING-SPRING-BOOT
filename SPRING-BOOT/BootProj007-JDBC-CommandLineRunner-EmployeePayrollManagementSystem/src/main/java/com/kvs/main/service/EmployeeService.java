package com.kvs.main.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.kvs.main.model.Employee;
import com.kvs.main.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public String insertEmployee(Employee employee) throws SQLException {
        return employeeRepository.addEmployee(employee);
    }

	public List<Employee> getAllEmployee() throws SQLException {
        return employeeRepository.findAll();
    }
	
	
	// UPDATE
    public String updateEmployee(long id, double salary) throws SQLException {
        return employeeRepository.updateEmployee(id, salary);
    }
    
 // DELETE
    public String deleteEmployee(long id) throws SQLException {
        return employeeRepository.deleteEmployee(id);
    }

}
