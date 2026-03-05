package com.kvs.main.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.kvs.main.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

	
}
