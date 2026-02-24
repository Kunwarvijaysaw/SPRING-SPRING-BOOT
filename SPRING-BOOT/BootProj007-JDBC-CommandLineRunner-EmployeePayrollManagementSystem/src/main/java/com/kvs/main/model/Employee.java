package com.kvs.main.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
	long id;
	String name;
	String Department;
	double Salary;
	String role;


}
