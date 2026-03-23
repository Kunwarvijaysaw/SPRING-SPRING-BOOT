package com.kvs.main.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Address55")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
	@Id
	Long addressId ;
	String street;
	String city;
	String state;
	String zipcode;

	@OneToOne(mappedBy = "address")
	private Employee employee;
	

}
