package com.example.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;
@Repository
public class StudentDao {

	@Autowired
	DataSource dataSource;
	public String saveStudent(Student student) throws SQLException
	{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement("insert into student50 values(?,?,?,?)");
		pstmt.setLong(1, student.getId());
		pstmt.setString(2, student.getName());
		pstmt.setString(3, student.getSubject());
		pstmt.setDouble(4, student.getMarks());
		int k = pstmt.executeUpdate();
		if(k>0)
			return "Student Saved With id:"+student.getId();
		else
			return "Invalid Input";
	}
	public List<Student> findAll() throws SQLException
	{
		List<Student> listOfStudents=new ArrayList<Student>();
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement("select * from student50");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next())
		{
		   listOfStudents.add(new Student(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getDouble(4)));	
		}
		return listOfStudents;
	}
	public double calculateAvgMarks()
	{
		return 0.0;
	}
}
