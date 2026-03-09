package com.kvs.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "StudentDetails")
@NoArgsConstructor
@AllArgsConstructor
public class Student {

	@Id
	Long id;
	String firstName;
	String lastName;
	Integer grade ;
	String city;
	Boolean active ;
}
