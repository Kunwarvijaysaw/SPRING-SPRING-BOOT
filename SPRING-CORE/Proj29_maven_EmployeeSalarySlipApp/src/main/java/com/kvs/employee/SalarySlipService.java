package com.kvs.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class SalarySlipService {
	
	@Autowired
	Employee employee;
	
	
	

	 public void generateSlip() {
		 employee.setId(101);
		 employee.setName("Kumar");
		 employee.setBasicSalary(40000);
		 employee.setHra(5000);
		 employee.setDa(5000);
		 employee.setTaxPercentage(10);
		 
		 double grossSalary =employee.basicSalary + employee.hra +employee.da;
		 double taxAmount = (grossSalary * employee.taxPercentage) / 100;
		 double  netSalary = grossSalary - taxAmount;

		 System.out.println("Expected Output : ");
		 System.out.println("Salary Slip for "+ employee.name +" : "+grossSalary);
		 System.out.println("Tax Deducted: "+taxAmount);
		 System.out.println("Net Salary: "+netSalary);
		
	 }




}
