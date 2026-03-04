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
@Table
@NoArgsConstructor
public class Course {
	@Id
	Long id ;
	
	String courseName ;
	
	String trainerName;
	
	Integer duration;
	Double fee ;
	LocalDate startDate ;

}
