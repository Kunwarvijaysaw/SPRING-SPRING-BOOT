package com.kvs.main.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@Table(name = "Employee786")
@NoArgsConstructor
public class Employee {
	@Id
	Long id;
	String name;
	String department;
	Double salary ;
	LocalDate joiningDate;


}
