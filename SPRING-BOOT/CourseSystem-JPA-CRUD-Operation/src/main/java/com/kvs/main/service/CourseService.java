package com.kvs.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kvs.main.entity.Course;
import com.kvs.main.repository.CourseRepository;
@Service
public class CourseService implements ICourseService{
	@Autowired
	CourseRepository courseRepository;

	@Override
	public Course addCourse(Course course) {
		Course save=courseRepository.save(course);
		if(save!=null) {
			System.out.println("Data Inserted Sucessfully...");
		}else {
			System.out.println("Data not inserted ..");
		}
		return save;
	}

	@Override
	public List<Course> addMultipleCourse(List<Course> courses) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Course> findCourseById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Course> allCourse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> selectedCourseByIds(List<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteCourseById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Course course) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteByMultiId(List<Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMultipleByEntity(List<Course> courses) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	

}
