package com.example.demo.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDao;
import com.example.demo.entity.Student;
@Service
public class StudentService {

	@Autowired
	StudentDao studentDao;
	public String insertStudent(Student student) throws SQLException
	{
		String saveStudent = studentDao.saveStudent(student);
		return saveStudent;
	}
	public List<Student> getAllStudent() throws SQLException
	{
		return studentDao.findAll();
	}
	public double calAvgMarks()
	{
		return 0.0;
	}
}
