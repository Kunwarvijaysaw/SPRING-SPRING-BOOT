package com.kvs.main.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.kvs.main.entity.Employee;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	@Autowired
	private RestTemplate template;

	@PostMapping("/save")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee e) {
		String getByID = "http://localhost:8080/api/employees/viewbyid/952";

		template.getForObject(getByID, Employee.class);
		return new ResponseEntity<Employee>(iEmpService.saveEmployee(e), HttpStatus.OK);
	}

	@GetMapping("/view")
	public List<Employee> getAllEmployees() {

	    String url = "http://localhost:8080/api/employees/view";

	    Employee[] employees =template.getForObject(url, Employee[].class);

	    return Arrays.asList(employees);
	}
	
	
	
	

//	@DeleteMapping("/{id}")
//	public String deleteEmployee(@PathVariable Long id) {
//		return iEmpService.deleteEmployee(id);
//	}
//
//	@PutMapping("/update/{id}")
//	public String updateEmployee(@PathVariable Long id, @RequestBody Employee e) {
//		return iEmpService.updateEmployee(id, e);
//	}

	@GetMapping("/viewbyid/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable Long id) {
		String getByID = "http://localhost:8080/api/employees/viewbyid/952";

		Employee employee = template.getForObject(getByID, Employee.class);
		
		return Optional.ofNullable(employee);
	}
}
