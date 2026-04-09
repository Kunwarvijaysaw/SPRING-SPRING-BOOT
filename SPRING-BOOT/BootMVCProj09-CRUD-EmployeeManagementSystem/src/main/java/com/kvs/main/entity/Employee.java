package com.kvs.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "Employees")
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	@Id
	private Integer id;
	private String name;
	private String department;
	private Double salary;
	private String designation;


}
