package com.kvs.main.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@Table(name = "travel1")
@NoArgsConstructor
public class Travel {
	@Id
	Long id;
	String destination;
	String transportationMode;
	Double price;

}
