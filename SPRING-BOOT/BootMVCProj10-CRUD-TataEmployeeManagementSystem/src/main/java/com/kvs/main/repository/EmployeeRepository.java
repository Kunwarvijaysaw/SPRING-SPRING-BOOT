package com.kvs.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kvs.main.entity.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Integer> {
	
	 // Optional search
    List<Employee> findByName(String name);

}
