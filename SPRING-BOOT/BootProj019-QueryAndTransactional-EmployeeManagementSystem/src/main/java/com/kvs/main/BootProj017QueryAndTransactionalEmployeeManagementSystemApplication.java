package com.kvs.main;

import java.time.LocalDate;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kvs.main.entity.Employee;
import com.kvs.main.service.EmployeeService;

@SpringBootApplication
public class BootProj017QueryAndTransactionalEmployeeManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BootProj017QueryAndTransactionalEmployeeManagementSystemApplication.class, args);
	}
	@Autowired
	EmployeeService service;
	
	@Override
	public void run(String... args) throws Exception {
		 Scanner sc = new Scanner(System.in);

	        while(true) {

	            System.out.println("\n===== Employee Management =====");
	            System.out.println("1. Add Employee");
	            System.out.println("2. View All Employees");
	            System.out.println("3. Find By Department");
	            System.out.println("4. Find Salary Greater Than");
	            System.out.println("5. Update Salary");
	            System.out.println("6. Delete Employee By Name");
	            System.out.println("7. Exit");

	            System.out.print("Enter Choice: ");
	            int choice = Integer.parseInt(sc.nextLine());

	            switch(choice) {

	            case 1:
	            	
	            	 System.out.print("Enter Id: ");
		             Long id = sc.nextLong();
		             
	                System.out.print("Enter Name: ");
	                String name = sc.next();

	                System.out.print("Enter Department: ");
	                String dept = sc.next();

	                System.out.print("Enter Salary: ");
	                Double salary = sc.nextDouble();

	                Employee e = new Employee(id, name, dept, salary, LocalDate.now());
	                service.save(e);

	                System.out.println("Employee Saved");
	                break;

	            case 2:
	                System.out.println("All Employees");
	                service.getAll().forEach(System.out::println);
	                break;

	            case 3:
	                System.out.print("Enter Department: ");
	                String d = sc.next();
	                service.getByDepartment(d).forEach(System.out::println);
	                break;

	            case 4:
	                System.out.print("Enter Salary: ");
	                Double s = sc.nextDouble();
	                service.getBySalaryGreaterThan(s).forEach(System.out::println);
	                break;

	            case 5:
	                System.out.print("Enter Employee ID: ");
	                Long id1 = Long.parseLong(sc.nextLine());

	                System.out.print("Enter New Salary: ");
	                Double newSalary = Double.parseDouble(sc.nextLine());

	                service.updateSalary(id1, newSalary);
	                System.out.println("Salary Updated");
	                break;

	            case 6:
	                System.out.print("Enter Employee Name: ");
	                String n = sc.nextLine();

	                service.deleteByName(n);
	                System.out.println("Employee Deleted");
	                break;

	            case 7:
	                System.out.println("Exiting Program...");
	                System.exit(0);

	            default:
	                System.out.println("Invalid Choice");
	            }
	        }
	   }
	
		
}


