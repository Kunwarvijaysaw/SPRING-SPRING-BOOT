package com.kvs.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.kvs.main.controller.StudentController;
import com.kvs.main.entiry.Student;

@SpringBootApplication
public class SgmsApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context =
                SpringApplication.run(SgmsApplication.class, args);

        StudentController sc = context.getBean(StudentController.class);

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {

            System.out.println("\n===== Student CRUD Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student Marks");
            System.out.println("4. Delete Student");
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

                        System.out.print("Enter Subject: ");
                        String subject = scanner.nextLine();

                        System.out.print("Enter Marks: ");
                        double marks = scanner.nextDouble();

                        System.out.println(
                                sc.addStudent(new Student(id, name, subject, marks))
                        );
                        break;

                    case 2:
                        List<Student> students = sc.viewAllStudent();
                        if (students.isEmpty()) {
                            System.out.println("No Records Found.");
                        } else {
                            students.forEach(System.out::println);
                        }
                        break;

                    case 3:
                        System.out.print("Enter ID to Update: ");
                        long updateId = scanner.nextLong();

                        System.out.print("Enter New Marks: ");
                        double newMarks = scanner.nextDouble();

                        System.out.println(
                                sc.updateStudent(updateId, newMarks)
                        );
                        break;

                    case 4:
                        System.out.print("Enter ID to Delete: ");
                        long deleteId = scanner.nextLong();

                        System.out.println(
                                sc.deleteStudent(deleteId)
                        );
                        break;

//                    case 5:
//                        double avg = sc.showAvgMarks();
//                        System.out.printf("Average Marks: %.2f\n", avg);
//                        break;

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
        context.close();
        System.out.println("Application Closed Successfully.");
    }
}