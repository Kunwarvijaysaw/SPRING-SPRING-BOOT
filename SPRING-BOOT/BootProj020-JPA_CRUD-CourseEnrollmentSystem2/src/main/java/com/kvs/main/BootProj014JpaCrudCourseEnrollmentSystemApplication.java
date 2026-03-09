package com.kvs.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import com.kvs.main.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kvs.main.controller.CourseController;
import com.kvs.main.entity.Course;


@SpringBootApplication
public class BootProj014JpaCrudCourseEnrollmentSystemApplication implements CommandLineRunner {
    

	public static void main(String[] args) {
		SpringApplication.run(BootProj014JpaCrudCourseEnrollmentSystemApplication.class, args);
	}
	
	@Autowired
	private CourseController courseController;

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {

            System.out.println("\n===== Travel Menu =====");
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
                        

                        
                        

                        
                        		courseController.addCourse(new Course(id, courseName, trainerName, duration, fee));
                       
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



                            Course course = new Course(id1,courseName1, trainerName1, duration1, fee1);

                            courses.add(course);
                        }

                        courseController.addMultipleCourse(courses);

                        break;
                        
                    case 3:
                        System.out.print("Enter ID to Find Course ");
                        Long findId = scanner.nextLong();
                 		System.out.println(courseController.findCourseById(findId));
                     
                        break;
                        
                    case 4:
                    	System.out.println("Enter Id to find exit");
                    	 Long exitId = scanner.nextLong();
                         System.out.println(exitId+" Exit : "+courseController.existsById(exitId));
                    	break;
                    	
                    case 5:
                        Iterable<Course> course = courseController.allCourse();
                        if (course==null) {
                            System.out.println("No Records Found.");
                        } else {
                            course.forEach(System.out::println);
                        }
                        break;
                        
                    case 6:
                    	 System.out.println("Enter number of IDs:");
                    	    int size = scanner.nextInt();

                    	    List<Long> ids = new ArrayList<>();

                    	    for(int i=1;i<=size;i++) {
                    	        System.out.print("Enter ID "+i+": ");
                    	        ids.add(scanner.nextLong());
                    	    }

                    	    List<Course> selectedCourses = courseController.selectedCourseByIds(ids);

                    	    selectedCourses.forEach(System.out::println);
                    	break;
                        
                    case 7:
                    	System.out.println("Enter count");
                    	System.out.println("Count : "+courseController.count());
                    	break;

                 

                   
                    case 8:
                    	System.out.print("Enter ID to delete Coursew ");
                        Long deleteId = scanner.nextLong();
                        courseController.deleteCourseById(deleteId);
                        System.out.println("Course Deleted Successfully");
                    	break;
                    	
                    case 9:

                        System.out.print("Enter ID: ");
                        long id2 = scanner.nextLong();
                        scanner.nextLine();

                        System.out.print("Enter Course Name: ");
                        String cname = scanner.nextLine();

                        System.out.print("Enter Trainer Name: ");
                        String tname = scanner.nextLine();

                        System.out.print("Enter Duration: ");
                        Integer dur = scanner.nextInt();

                        System.out.print("Enter Fee: ");
                        Double fee2 = scanner.nextDouble();



                        courseController.delete(
                            new Course(id2,cname,tname,dur,fee2)
                        );

                        System.out.println("Course Deleted Using Entity");

                        break;



                    case 10:

                        System.out.println("Enter number of IDs to delete:");
                        int total = scanner.nextInt();

                        List<Long> delIds = new ArrayList<>();

                        for(int i=1;i<=total;i++) {
                            System.out.print("Enter ID "+i+": ");
                            delIds.add(scanner.nextLong());
                        }

                        courseController.deleteByMultiId(delIds);

                        System.out.println("Courses Deleted Successfully");

                        break;



                    case 11:

                        System.out.println("Enter number of courses to delete:");
                        int num = scanner.nextInt();

                        List<Course> delCourses = new ArrayList<>();

                        for(int i=1;i<=num;i++) {

                            System.out.print("Enter ID: ");
                            long cid = scanner.nextLong();
                            scanner.nextLine();

                            System.out.print("Enter Course Name: ");
                            String cn = scanner.nextLine();

                            System.out.print("Enter Trainer Name: ");
                            String tn = scanner.nextLine();

                            System.out.print("Enter Duration: ");
                            Integer du = scanner.nextInt();

                            System.out.print("Enter Fee: ");
                            Double fe = scanner.nextDouble();


                            delCourses.add(new Course(cid,cn,tn,du,fe));
                        }

                        courseController.deleteMultipleByEntity(delCourses);

                        System.out.println("Multiple Courses Deleted");

                        break;
                   	
                    

                        
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
