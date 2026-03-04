package com.kvs.main.service;

import java.util.List;
import java.util.Optional;

import com.kvs.main.entity.Course;


public interface ICourseService {

	
	// 1. Insert one course
    Course addCourse(Course course);

    // 2. Insert multiple courses
    List<Course> addMultipleCourse(List<Course> courses);

    // 3. Find course by ID
    Optional<Course> findCourseById(Long id);

    // 4. Check existence
    boolean existsById(Long id);

    // 5. Find all courses
    List<Course> allCourse();

    // 6. Find selected courses by IDs
    List<Course> selectedCourseByIds(List<Long> ids);

    // 7. Count total courses
    long count();

    // 8. Delete course by ID
    void deleteCourseById(Long id);

    // 9. Delete using entity object
    void delete(Course course);

    // 10. Delete multiple by IDs
    void deleteByMultiId(List<Long> ids);

    // 11. Delete multiple by entity list
    void deleteMultipleByEntity(List<Course> courses);

    // 12. Delete all courses
    void deleteAll();


}
