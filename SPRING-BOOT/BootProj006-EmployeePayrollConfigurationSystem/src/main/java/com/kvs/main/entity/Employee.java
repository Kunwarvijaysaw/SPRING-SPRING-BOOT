package com.kvs.main.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Employee {
	
	String companyName;
	String currency;
	double taxRate;
	boolean overtimeEnabled;
}
