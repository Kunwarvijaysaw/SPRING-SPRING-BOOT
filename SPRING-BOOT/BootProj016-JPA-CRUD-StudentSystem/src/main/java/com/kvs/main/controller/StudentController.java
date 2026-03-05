package com.kvs.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.kvs.main.entity.Student;
import com.kvs.main.service.IStusentService;

@Controller
public class StudentController {
	
	@Autowired
	IStusentService iStusentService;
	
	// insert one student
    public Student saveStudent(Student student) {
		return iStusentService.saveStudent(student);
    	
    }

//    // insert multiple students
//    public Iterable<Student> saveAllStudents(List<Student> students);
//
//    // get student by id
//    public Optional<Student> getStudentById(Long rollNo);
//
//    // get all students
//    public Iterable<Student> getAllStudents();
//
//    // check student exists
//    public boolean isStudentExist(Long rollNo);
//
//    // count students
//    public long getStudentCount();
//
//    // delete student by id
//    public void deleteStudentById(Long rollNo);
//
//    // delete student object
//    public void deleteStudent(Student student);
//
//    // delete multiple students
//    public void deleteStudents(List<Student> students);
//
//    // delete all students
//    public void deleteAllStudents();

}
