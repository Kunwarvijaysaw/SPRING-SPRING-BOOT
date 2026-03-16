package com.kvs.main;

import java.util.Scanner;

import com.kvs.main.entity.Student;
import com.kvs.main.repository.StudentRepository;
import com.kvs.main.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test01CrudjpaStudentSystemApplication implements CommandLineRunner {

    private final StudentRepository studentRepository;

    Test01CrudjpaStudentSystemApplication(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

	public static void main(String[] args) {
		SpringApplication.run(Test01CrudjpaStudentSystemApplication.class, args);
	}
	@Autowired
	StudentService service;
	
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
					 System.out.println("Enter Student Id:");
				        Long id = sc.nextLong();
				        sc.nextLine(); // consume newline

				        System.out.println("Enter Student Name:");
				        String name = sc.nextLine();

				        System.out.println("Enter Course:");
				        String course = sc.nextLine();

				        System.out.println("Enter Email:");
				        String email = sc.nextLine();
				        
				        service.addStudent(new Student(id, name, course, email));
				        
				        break;
				        
				case 2:
					service.getAllStudent().forEach(System.out::println);
					break;
					
				case 3:
					System.out.println("Enter Student Id:");
			        Long id1 = sc.nextLong();
			       // sc.nextLine(); 
					System.out.println(service.findStudentById(id1));
					break;
					
				case 4:
					System.out.println("Enter Student Id:");
			        Long id2 = sc.nextLong();
			        service.deleteStudentById(id2);
			        break;
			        
			        
				case 5:
					System.out.println("Enter Student Id:");
			        Long id3 = sc.nextLong();
			        sc.nextLine(); // consume newline

			        System.out.println("Enter Student Name:");
			        String name1 = sc.nextLine();
			        
			        service.updateStudent(id3, name1);
			        break;
					
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
