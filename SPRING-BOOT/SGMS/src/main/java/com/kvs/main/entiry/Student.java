package com.kvs.main.entiry;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
	
	private long id;
	private String name;
	private String dept;
	private double salary;

}
