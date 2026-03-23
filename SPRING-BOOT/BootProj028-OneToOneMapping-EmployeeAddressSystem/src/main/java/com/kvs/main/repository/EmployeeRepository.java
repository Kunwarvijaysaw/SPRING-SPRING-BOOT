package com.kvs.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kvs.main.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
