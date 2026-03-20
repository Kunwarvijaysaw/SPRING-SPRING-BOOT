package com.kvs.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kvs.main.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
