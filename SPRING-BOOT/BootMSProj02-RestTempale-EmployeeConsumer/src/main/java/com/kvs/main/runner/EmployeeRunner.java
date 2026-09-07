package com.kvs.main.runner;

import java.util.Optional;

import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.kvs.main.entity.Employee;

@Component
public class EmployeeRunner implements CommandLineRunner{
	
	@Autowired
	private RestTemplate template;

	@Override
	public void run(String... args) throws Exception {
		
		String getByID="http://localhost:8080/api/employees/viewbyid/952";
		
		//template.postForObject(getByID, Employee.class);
		Employee employee = template.getForObject(getByID, Employee.class);
		System.out.println(employee);
	}

}
