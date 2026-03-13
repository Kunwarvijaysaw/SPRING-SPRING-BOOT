package com.kvs.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Product1")
public class Product {
	
	@Id
	Long id;
	String name;
	String category;
	Double price ;
	Boolean available;

	

}
