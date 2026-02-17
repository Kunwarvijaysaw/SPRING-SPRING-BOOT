package com.kvs.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.kvs.Entitiy.Student;

@Repository
public class StudentDAO 
{

	@Autowired
	DataSource dt;


	
	public void insert(Student stu) throws SQLException
	{
		Connection connection = dt.getConnection();
		PreparedStatement ps = connection.prepareStatement("insert into student5 values(?,?,?,?)");
		ps.setLong(1, stu.getStudentId());
		ps.setString(2, stu.getName());
		ps.setString(3, stu.getSubject());
		ps.setDouble(4, stu.getMarks());
		int k = ps.executeUpdate();
		if(k>0) {
		System.out.println("Data inserted Sucessfully");
		}else {
			System.out.println("Data not Inserted");
		}
	
		
	}
	
}
