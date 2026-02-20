package com.example.demo.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService service;
	//Add student
	public String addStudent(Student student) throws SQLException
	{
		return service.insertStudent(student);
	}
	//View all students
	public List<Student> viewAllStudent() throws SQLException
	{
		List<Student> allStudent = service.getAllStudent();
		return allStudent;
	}
	//Show average marks
	public double showAvgMarks() throws SQLException
	{
		double sum=0;
		List<Student> list=service.getAllStudent();
		
		for (Student s : list) {
	        sum += s.getMarks();   // assuming getter method
	    }

	    return sum / list.size();
	}
}
