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
@NoArgsConstructor
@Entity
@Table
public class HotelReservation {
	@Id
	Long id ;
	String customerName ;
	String roomType;
	LocalDate checkInDate;
	LocalDate checkOutDate; 
	Double price ;


}
