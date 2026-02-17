package com.kvs;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.kvs.DAO.StudentDAO;
import com.kvs.Entitiy.Student;

@SpringBootApplication
public class BootProj005StudentGradeManagementSystemUsingPlainJdbc1Application {

	public static void main(String[] args) throws SQLException {
		ConfigurableApplicationContext ctx = SpringApplication.run(BootProj005StudentGradeManagementSystemUsingPlainJdbc1Application.class, args);
		StudentDAO student=ctx.getBean(StudentDAO.class);
		student.insert(new Student(103,"Smita","Com",95.0));
		
		
	}

}
