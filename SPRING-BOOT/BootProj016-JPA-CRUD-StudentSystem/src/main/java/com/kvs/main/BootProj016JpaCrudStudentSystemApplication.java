package com.kvs.main;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kvs.main.controller.StudentController;
import com.kvs.main.entity.Student;

@SpringBootApplication
public class BootProj016JpaCrudStudentSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BootProj016JpaCrudStudentSystemApplication.class, args);
	}
	@Autowired
	StudentController studentController;

	@Override
	public void run(String... args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Insert single student Data");
		System.out.println("Enter Choice");
		int choice=sc.nextInt();
		
		switch (choice) {
		
		case 1:
			System.out.print("Enter Roll No: ");
	        Long rollNo = sc.nextLong();
	        sc.nextLine();   // clear buffer

	        System.out.print("Enter Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Course: ");
	        String course = sc.nextLine();

	        System.out.print("Enter College: ");
	        String college = sc.nextLine();

			studentController.saveStudent(new Student(rollNo, name, course, college));
		}
		
		
	}

}
