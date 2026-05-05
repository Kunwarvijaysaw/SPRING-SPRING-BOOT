package com.kvs.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.kvs.main.entity.Employee;
import com.kvs.main.service.IEmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	@Autowired
	IEmployeeService iEmpService;
	
	@PostMapping("/save")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee e) {
		
		return new ResponseEntity<Employee>(iEmpService.saveEmployee(e),HttpStatus.OK);
		
	}
	@GetMapping("/view")
	public List<Employee> getAllEmployees() {
	    return iEmpService.getAllEmployees();
	}
	
	@DeleteMapping("/{id}")
	public String deleteEmployee(Long id) {
	    return iEmpService.deleteEmployee(id);
	}
}
