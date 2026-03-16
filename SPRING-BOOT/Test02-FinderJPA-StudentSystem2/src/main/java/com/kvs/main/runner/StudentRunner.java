package com.kvs.main.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kvs.main.entity.Student;
import com.kvs.main.repository.StudentRepository;

@Component
public class StudentRunner implements CommandLineRunner{
	@Autowired
	StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		Scanner sc=new Scanner(System.in);
		try {
			
			while(true) {
				
				System.out.println("======Menu=======");
				System.out.println("1.Add Student");
				System.out.println("2.View All Student");
				System.out.println("3.Find by Id");
				System.out.println("4.Delete by Id");
				System.out.println("5.Update emailby id");
				
				System.out.println("Enter option");
				int option=sc.nextInt();
				
				switch(option) {
				case 1:
					System.out.println("Enter Id:");
			        Long id = sc.nextLong();
			        sc.nextLine();   // consume newline

			        System.out.println("Enter Name:");
			        String name = sc.nextLine();

			        System.out.println("Enter Course:");
			        String course = sc.nextLine();

			        System.out.println("Course Completed (true/false):");
			        Boolean completed = sc.nextBoolean();

			        System.out.println("Enter Fee:");
			        double fee = sc.nextDouble();
			        
			        List<Student> list =Arrays.asList(new Student(id, name, course, completed, fee));
			        Iterable<Student> save = studentRepository.saveAll(list);
			        System.out.println(id+" Project save Sucessfully....... ");
			        break;
				       
				        
				case 2:
					Iterable<Student> proj= studentRepository.findAll();
					if(proj == null) {
						System.out.println("No Record found..");
					}else {
						proj.forEach(System.out::println);
					}
					break;
					
					
				case 3:
					System.out.println("Enter Id");
					Long id1=sc.nextLong();
					
					studentRepository.findById(id1);
					break;
					
				case 4:
					studentRepository.findByCompletedTrue();
					break;
					
				case 5:
					studentRepository.findByCompletedFalse();
					break;
					
				case 6:
					System.out.println("Enter Fees");
					Double fees=sc.nextDouble();
					
					studentRepository.findByFeeGreaterThan(fees);
					break;
					
				
					
				
					
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
