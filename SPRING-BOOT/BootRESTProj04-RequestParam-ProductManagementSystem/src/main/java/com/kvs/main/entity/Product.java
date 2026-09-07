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
@Table(name = "Product14")
@Entity
public class Product {

	
	@Id
	Integer productId ;
	String productName ;
	Double  price ;
	Integer quantity ;

}
