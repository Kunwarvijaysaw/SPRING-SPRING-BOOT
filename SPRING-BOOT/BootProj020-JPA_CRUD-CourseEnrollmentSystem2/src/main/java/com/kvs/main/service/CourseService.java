package com.kvs.main.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kvs.main.entity.Course;
import com.kvs.main.repository.CourseRepository;

@Service
public class CourseService implements ICourseService {
	
	@Autowired
	CourseRepository courseRepository;

	@Override
	public Course addCourse(Course course) {
		Course save=courseRepository.save(course);
		if(save!=null) {
			System.out.println("Data Inserted sucessfully...!");
		}else {
			System.out.println("Data not Inserted ...!");
		}
		return save;
	}

	@Override
	public List<Course> addMultipleCourse(List<Course> courses) {
		List<Course> savedCourses = new ArrayList<>();
       courseRepository.saveAll(courses).forEach(savedCourses::add);
        return savedCourses;
	}

	@Override
	public Optional<Course> findCourseById(Long id) {
		return courseRepository.findById(id);
	}

	@Override
	public boolean existsById(Long id) {
		return courseRepository.existsById(id);
	}

	@Override
	public List<Course> allCourse() {
		List<Course> list = new ArrayList<>();
        courseRepository.findAll().forEach(list::add);
        return list;
	}

	@Override
	public List<Course> selectedCourseByIds(List<Long> ids) {
		List<Course> list = new ArrayList<>();
        courseRepository.findAllById(ids).forEach(list::add);
        return list;
	}

	@Override
	public long count() {
		return courseRepository.count();
	}

	@Override
	public void deleteCourseById(Long id) {
		courseRepository.deleteById(id);
		
	}

	@Override
	public void delete(Course course) {
	courseRepository.delete(course);
	}

	@Override
	public void deleteByMultiId(List<Long> ids) {
		courseRepository.deleteAllById(ids);
		
	}

	@Override
	public void deleteMultipleByEntity(List<Course> courses) {
		courseRepository.deleteAll(courses);
	}

	@Override
	public void deleteAll() {
		courseRepository.deleteAll();
		
	}
	
	
	
	

}
