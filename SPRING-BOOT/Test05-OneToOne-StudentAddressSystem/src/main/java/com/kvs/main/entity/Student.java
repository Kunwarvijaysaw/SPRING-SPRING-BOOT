package com.kvs.main.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.criteria.Join;

public class Student {
	@Id
	Long studentId;
	String name;
	String department;
	String course;
	
	@OneToOne(cascade =CascadeType.ALL)
	@JoinColumn(name="address_Id")
	Address address;

}
