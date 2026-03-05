package com.kvs.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kvs.main.controller.CourseController;
import com.kvs.main.entity.Course;

@SpringBootApplication
public class CourseSystemJpaCrudOperationApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CourseSystemJpaCrudOperationApplication.class, args);
	}
	
	@Autowired
	CourseController courseController;
	
	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {

            System.out.println("\n===== Course Menu =====");
            System.out.println("1. Insert one course.");
            System.out.println("2. Insert multiple courses.");
            System.out.println("3. Find course by ID.");
            System.out.println("5. Find all courses.");
            System.out.println("4. Check existence.");
            System.out.println("6. Find selected courses by IDs.");
            System.out.println("7. Count total courses.");
            System.out.println("8. Delete course by ID");
            System.out.println("9. Delete using entity object. ");
            System.out.println("10. Delete multiple by IDs.  ");
            System.out.println("11. Delete multiple by entity list.  ");
            System.out.println("12. Delete all Course.");
            System.out.println("13. Exit");
            
            System.out.print("Enter Choice: ");
            int choice = scanner.nextInt();

            try {

                switch (choice) {

                    case 1:
                        System.out.print("Enter ID: ");
                        long id = scanner.nextLong();
                        scanner.nextLine(); // clear buffer

                        System.out.print("Enter Course Name: ");
                        String courseName = scanner.nextLine();

                        System.out.print("Enter Trainer Name: ");
                        String trainerName = scanner.nextLine();

                        System.out.print("Enter Duration: ");
                        Integer duration = scanner.nextInt();
                        
                        System.out.print("Enter Fee: ");
                        Double fee = scanner.nextDouble();
                        
                        System.out.print("Enter Year ");
                        int years=scanner.nextInt();
                        System.out.print("Enter month ");
                        int months=scanner.nextInt();
                        System.out.print("Enter month of date ");
                        int days=scanner.nextInt();
                        
                        
                        LocalDate sDate = LocalDate.of(years, months, days);
                        
                        
                        

                        
                        courseController.addCourse(new Course(id, courseName, trainerName, duration, fee, sDate));
                       
                        break;
                    case 2:

                        System.out.println("Enter how many Courses to be added:");
                        int n = scanner.nextInt();

                        List<Course> courses = new ArrayList<>();

                        for(int i = 1; i <= n; i++) {

                            System.out.println("\nEnter details for Course " + i);
                            System.out.print("Enter ID: ");
                            long id1 = scanner.nextLong();
                            scanner.nextLine(); // clear buffer

                            scanner.nextLine(); // clear buffer

                            System.out.print("Enter Course Name: ");
                            String courseName1 = scanner.nextLine();

                            System.out.print("Enter Trainer Name: ");
                            String trainerName1 = scanner.nextLine();

                            System.out.print("Enter Duration: ");
                            Integer duration1 = scanner.nextInt();

                            System.out.print("Enter Fee: ");
                            Double fee1 = scanner.nextDouble();

                            System.out.print("Enter Year: ");
                            int year = scanner.nextInt();

                            System.out.print("Enter Month: ");
                            int month = scanner.nextInt();

                            System.out.print("Enter Day: ");
                            int day = scanner.nextInt();

                            LocalDate startDate = LocalDate.of(year, month, day);

                            Course course = new Course(id1,courseName1, trainerName1, duration1, fee1, startDate);

                            courses.add(course);
                        }

                        courseController.addMultipleCourse(courses);

                        break;
                        
                    case 3:
                        System.out.print("Enter ID to Find Course ");
                        Long findId = scanner.nextLong();
                 		courseController.findCourseById(findId);
                     
                        break;
                        
                    case 4:
                    	System.out.println("Enter Id to find exit");
                    	 Long exitId = scanner.nextLong();
                         courseController.existsById(exitId);
                    	break;
                    	
                    case 5:
                        Iterable<Course> course = courseController.allCourse();
                        if (course==null) {
                            System.out.println("No Records Found.");
                        } else {
                            course.forEach(System.out::println);
                        }
                        break;
                        
                    case 7:
                    	System.out.println("Enter count");
                    	courseController.count();
                    	break;

                 

                   
                    case 8:
                    	System.out.print("Enter ID to delete Coursew ");
                        Long deleteId = scanner.nextLong();
                        courseController.deleteCourseById(deleteId);
                    	break;
                   	
                    
//                    	
                   
//                    	
//                    case 7:
//                    	System.out.print("Enter ID: ");
//                        long id1 = scanner.nextLong();
//                        scanner.nextLine(); // clear buffer
//
//                        System.out.print("Enter Destination: ");
//                        String destination1 = scanner.nextLine();
//
//                        System.out.print("Enter transportationMode: ");
//                        String transportationMode1 = scanner.nextLine();
//
//                        System.out.print("Enter Price: ");
//                        double price1 = scanner.nextDouble();
//                        
//                    	 
//                    	travelController.deleteTravelObject(new Travel(id1, destination1, transportationMode1,  price1 ));
//                    	break;
//                    case 11:
//                    	courseController.deleteByMultiId(List<urse>);
//                    	break;
                        
                    case 12:
                    	courseController.deleteAll();
                    	break;
                    	
                    case 13:
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
        System.out.println("Application Closed Successfully.");
    

		
	}

	

}
