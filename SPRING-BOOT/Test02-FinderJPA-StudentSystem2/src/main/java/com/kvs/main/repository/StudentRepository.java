package com.kvs.main.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kvs.main.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	Optional findById(Long id);
	
	List<Student> findByFeeGreaterThan(Double amount);
	
	
	List<Student> findByCompletedTrue();

	List<Student> findByCompletedFalse();
	
	
	List<Student> findTop3OrderByFeeDesc();
	
	
	

}
