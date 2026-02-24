package com.kvs.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import com.kvs.main.model.Employee;
import com.kvs.main.service.EmployeeService;

@SpringBootApplication
public class BootProj007JdbcCommandLineRunnerEmployeePayrollManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BootProj007JdbcCommandLineRunnerEmployeePayrollManagementSystemApplication.class, args);
	}

	@Autowired
	private EmployeeService employeeService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		 
		Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {

            System.out.println("\n===== Employee CRUD Menu =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employee");
            System.out.println("3. Update SEmployees Salary");
            System.out.println("4. Delete SEmployee");
           // System.out.println("5. Show Average Marks");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            int choice = scanner.nextInt();

            try {

                switch (choice) {

                    case 1:
                        System.out.print("Enter ID: ");
                        long id = scanner.nextLong();
                        scanner.nextLine(); // clear buffer

                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();

                        System.out.print("Enter Dept: ");
                        String dept = scanner.nextLine();

                        System.out.print("Enter Salary: ");
                        double salary = scanner.nextDouble();
                        
                        scanner.nextLine();
                        System.out.print("Enter Role: ");
                        String role = scanner.nextLine();

                        System.out.println(
                        		employeeService.insertEmployee(new Employee(id, name, dept, salary,role))
                        );
                        break;

                    case 2:
                        List<Employee> employees = employeeService.getAllEmployee();
                        if (employees.isEmpty()) {
                            System.out.println("No Records Found.");
                        } else {
                            employees.forEach(System.out::println);
                        }
                        break;

                    case 3:
                        System.out.print("Enter ID to Update: ");
                        long updateId = scanner.nextLong();

                        System.out.print("Enter New Salary: ");
                        double newSalary = scanner.nextDouble();

                        System.out.println(
                        		employeeService.updateEmployee(updateId, newSalary)
                        );
                        break;

                    case 4:
                        System.out.print("Enter ID to Delete: ");
                        long deleteId = scanner.nextLong();

                        System.out.println(
                        		employeeService.deleteEmployee(deleteId)
                        );
                        break;



                    case 6:
                        System.out.println("Exiting Application...");
                        running = false;
                        break;

                    default:
                        System.out.println("Invalid Choice! Try Again.");
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
//        context.close();
        System.out.println("Application Closed Successfully.");
    }
}