package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.controller.StudentController;
import com.example.demo.entity.Student;

@SpringBootApplication
public class StudentGradeManagementSystemApplication {

	@Bean
	public Student getStudent()
	{
		return new Student(115, "Rajat", "AWS", 90);
	}
	public static void main(String[] args) {
		ApplicationContext run = SpringApplication.run(StudentGradeManagementSystemApplication.class, args);
	    Student stu = run.getBean(Student.class);
	   StudentController sc = run.getBean(StudentController.class);
	   try{
		   System.out.println(sc.addStudent(stu));
		   List<Student> viewAllStudent = sc.viewAllStudent();
		   viewAllStudent.forEach(System.out::println);
		   System.out.println("Average : "+sc.showAvgMarks());
		   
	   }
	   catch (Exception e) {
		e.printStackTrace();
	}
	}

}
