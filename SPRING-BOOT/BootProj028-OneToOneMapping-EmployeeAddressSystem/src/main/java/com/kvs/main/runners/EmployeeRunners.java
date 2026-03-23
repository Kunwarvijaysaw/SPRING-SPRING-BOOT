package com.kvs.main.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kvs.main.entity.Address;
import com.kvs.main.entity.Employee;
import com.kvs.main.service.IEmployeeService;
@Component
public class EmployeeRunners implements CommandLineRunner{
	
	@Autowired
	IEmployeeService iService;

	@Override
	public void run(String... args) throws Exception {
		 Address address=new Address();
		 address.setAddressId(101L);
		 address.setCity("Hydrabad");
		 address.setState("Telengana");
		 address.setStreet("Ameerpet");
		 address.setZipcode("856001");
		 
		 
		 Employee employee=new Employee();
		 employee.setAddress(address);
		 employee.setEmpId(101L);
		 employee.setEmpDept("IT");
		 employee.setEmpName("KVS");
		 employee.setSalary(50000D);
		 
		 iService.saveEmployeeWithAddress(employee);
		 System.out.println("Data inserted..!");
		 
		 
		 // Fetch employee details
	        iService.getEmployeeDetails(employee.getEmpId())
	                .ifPresent(emp -> {
	                    System.out.println("Employee saved: " + emp.getEmpName());
	                    System.out.println("Department: " + emp.getEmpDept());
	                    System.out.println("Salary: " + emp.getSalary());
	                    System.out.println("City: " + emp.getAddress().getCity());
	                });

	        

		 
		 
		
	}

}
