package com.kvs.main.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Employee55")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	@Id
	Long empId;
	String empName;
	String empDept;
	Double salary;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	Address address;

}
