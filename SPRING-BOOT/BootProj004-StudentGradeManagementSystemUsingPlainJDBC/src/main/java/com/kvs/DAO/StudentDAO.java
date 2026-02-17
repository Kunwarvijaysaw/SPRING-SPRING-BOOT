package com.kvs.DAO;

import java.sql.Connection;
import java.sql.JDBCType;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.kvs.Entitiy.Student;

public class StudentDAO 
{	
	DataSource dt;
	
	public void insert(Student stu) throws SQLException
	{
		Connection connection = dt.getConnection(null, null);
		connection.prepareCall("insert into student values("+stu.getName()+);
		
	}
	public ArrayList<Student> getAllStuent()
	{
		
		jdbc.
	}
}
