package com.kvs.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@Table
@NoArgsConstructor
public class Product {
	@Id
	Integer id;
	String name;
	String category;
	double price;

}
