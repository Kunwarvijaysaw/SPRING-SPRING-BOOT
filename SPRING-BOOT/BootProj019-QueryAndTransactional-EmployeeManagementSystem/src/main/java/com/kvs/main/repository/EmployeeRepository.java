package com.kvs.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.kvs.main.entity.Employee;

import jakarta.transaction.Transactional;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
	@Query("select e  from Employee e where e.department = :dept")
	List<Employee> findByDepartment(@Param("dept") String department);// → Get employees by department

	@Query("select e from Employee e where e.salary > :salary")
	List<Employee> findBySalaryGreaterThan(Double salary) ;//→ Get employees with salary above threshold.

	 @Modifying
	 @Query("update Employee e set e.salary = :salary where e.id = :id")
	 int updateSalaryById(Long id, Double salary);
	 
	@Modifying
	@Query("delete from Employee e where e.name = :name")
	int deleteByName(String name);// → Delete employee by name. (Requires @Transactional in service)

}
