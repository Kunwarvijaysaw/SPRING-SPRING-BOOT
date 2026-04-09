package com.kvs.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "address101")
public class Address {
	
	@Id
	Long addressId ;
	String city;
	String state;
	String zipcode;

	@OneToOne(mappedBy = "address")
	Student student;

}
