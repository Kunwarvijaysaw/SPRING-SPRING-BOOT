package com.kvs.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kvs.main.entity.Course;
@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {

}
