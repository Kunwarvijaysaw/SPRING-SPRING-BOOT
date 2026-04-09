package com.kvs.main.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kvs.main.entity.Employee;
import com.kvs.main.service.EmployeeService;

@Controller
public class EmployeeController {
	
	
	@Autowired
	private EmployeeService service;
	
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/empview")
	public String empViewAll(Map<String, Object> map) {
		List<Employee> allEmployees = service.getAllEmployees();
		map.put("viewall", allEmployees);
		return "viewAllEmp";
	}
	
	@RequestMapping("/addEmp")
	public String addEmp() {
		return "add";
	}
	
	@PostMapping("/add")
	public String  addEmployee(@ModelAttribute Employee emp) {
		Employee employee = service.addEmployee(emp);
		System.out.println(employee);
		return "redirect:/empview";
		
	}
	
	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam Integer id) {
	    service.deleteEmployee(id);
	    return "redirect:/empview";
	}
	
	
	@GetMapping("/edit")
	public String editEmp(@RequestParam Integer id, Map<String, Object> map) {
	    Employee emp = service.getEmployeeById(id).get();
	    map.put("emp", emp);
	    return "update";
	}
	
	
	@PostMapping("/update")
	public String updateEmployee(@ModelAttribute Employee emp) {
	    service.updateEmployee(emp);
	    return "redirect:/empview";
	}
	

}
