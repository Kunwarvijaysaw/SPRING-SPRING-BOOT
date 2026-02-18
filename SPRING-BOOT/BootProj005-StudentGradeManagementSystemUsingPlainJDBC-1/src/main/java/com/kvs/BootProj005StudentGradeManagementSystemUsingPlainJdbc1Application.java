package com.kvs;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.kvs.DAO.StudentDAO;
import com.kvs.Entitiy.Student;

@SpringBootApplication
public class BootProj005StudentGradeManagementSystemUsingPlainJdbc1Application {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		ConfigurableApplicationContext ctx = SpringApplication.run(BootProj005StudentGradeManagementSystemUsingPlainJdbc1Application.class, args);
		StudentDAO student=ctx.getBean(StudentDAO.class);
		System.out.println("1. Inser data "+"\n2.View table data"+"\nEnter Option");
		int option =sc.nextInt();
		switch (option) {
		case 1:{
			System.out.println("Inser Data");			System.out.println("Enter Student ID");
			long id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Student Name");
			String name=sc.nextLine();
			System.out.println("Enter Student Subject");
			String sub=sc.nextLine();
			System.out.println("Enter Student Marks");
			double marks=sc.nextDouble();
			//student.insert(new Student(104,"SK","Java",65.0));
			student.insert(new Student(id,name,sub,marks));
			break;
		}
		case 2:{
			
			student.viewTableData();
            break;
		}
		
		}
		
		
		
	}

}
