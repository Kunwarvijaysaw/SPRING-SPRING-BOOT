package com.kvs.main.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kvs.main.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long>{

List<Student> findByCity(String city);

List<Student> findByGradeGreaterThanEqual(Integer grade);

List<Student> findByFirstNameStartingWith(String prefix);

List<Student> findByActiveAndGradeBetween(Boolean active, Integer min, Integer max);

}
