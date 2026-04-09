package com.kvs.main.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kvs.main.entity.Employee;
import com.kvs.main.service.EmployeeService;

@Controller

public class EmployeeController {
	
	
	@Autowired
	private EmployeeService service;
	
	
	@GetMapping("/homepage")
	public String home() {
		return "home";
	}
	
	@GetMapping("/empview")
	public String empViewAll(Map<String, Object> map) {
		List<Employee> allEmployees = service.getAllEmployees();
		map.put("viewall", allEmployees);
		return "viewAllEmp";
	}
	
	@GetMapping("/addEmp")
	public String addEmp() {
		return "add";
	}
	
	@PostMapping("/add")
	public String  addEmployee(@ModelAttribute Employee emp) {
		service.addEmployee(emp);
		return "redidect:/empview";
		
	}
	
	

}
