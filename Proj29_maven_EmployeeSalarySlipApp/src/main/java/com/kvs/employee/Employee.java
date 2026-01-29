package com.kvs.employee;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	int id;
	String name;
	double basicSalary;
	double hra;
	double da;
	double taxPercentage;
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public void setDa(double da) {
		this.da = da;
	}
	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
//	public Employee(int id, String name, double basicSalary, double hra, double da, double taxPercentage) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.basicSalary = basicSalary;
//		this.hra = hra;
//		this.da = da;
//		this.taxPercentage = taxPercentage;
//	}
	
	


}
