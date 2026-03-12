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
@Table(name = "Projects")
@NoArgsConstructor
public class Project {
	
	@Id
	Long id;
	String projectName;
	String clientName; 
	LocalDate  startDate ; 
	LocalDate endDate ;
	Double budget; 
	Boolean completed;


}
