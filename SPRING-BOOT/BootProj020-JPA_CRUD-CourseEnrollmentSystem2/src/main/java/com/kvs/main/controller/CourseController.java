package com.kvs.main.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.kvs.main.entity.Course;
import com.kvs.main.service.ICourseService;

@Controller
public class CourseController {
	
	@Autowired
	
	ICourseService iCourseService;
	
	
	public Course addCourse(Course course) {
		return iCourseService.addCourse(course);
	}

	
	public List<Course> addMultipleCourse(List<Course> courses) {
        return iCourseService.addMultipleCourse(courses);
	}

	
	public Optional<Course> findCourseById(Long id) {
		return iCourseService.findCourseById(id);
	}


	public boolean existsById(Long id) {
		return iCourseService.existsById(id);
	}

	
	public List<Course> allCourse() {
		
        return iCourseService.allCourse();
	}

	public List<Course> selectedCourseByIds(List<Long> ids) {
		
        return iCourseService.selectedCourseByIds(ids);
	}


	public long count() {
		return iCourseService.count();
	}


	public void deleteCourseById(Long id) {
		iCourseService.deleteCourseById(id);
		
	}

	public void delete(Course course) {
	iCourseService.delete(course);
	}


	public void deleteByMultiId(List<Long> ids) {
		iCourseService.deleteByMultiId(ids);
		
	}


	public void deleteMultipleByEntity(List<Course> courses) {
		iCourseService.deleteMultipleByEntity(courses);
	}

	
	public void deleteAll() {
		iCourseService.deleteAll();
	}
	
}
