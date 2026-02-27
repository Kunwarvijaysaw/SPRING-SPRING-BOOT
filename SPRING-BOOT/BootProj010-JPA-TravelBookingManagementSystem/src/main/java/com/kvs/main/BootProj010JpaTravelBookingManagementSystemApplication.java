package com.kvs.main;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kvs.main.controller.TravelController;
import com.kvs.main.entity.Travel;



@SpringBootApplication
public class BootProj010JpaTravelBookingManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BootProj010JpaTravelBookingManagementSystemApplication.class, args);
	}
	@Autowired
	TravelController travelController;
	@Override
	public void run(String... args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {

            System.out.println("\n===== Travel Menu =====");
            System.out.println("1. Add a new travel booking");
            System.out.println("2. Retrieve all travel bookings");
            System.out.println("3. Find a travel booking by ID");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            int choice = scanner.nextInt();

            try {

                switch (choice) {

                    case 1:
                        System.out.print("Enter ID: ");
                        long id = scanner.nextLong();
                        scanner.nextLine(); // clear buffer

                        System.out.print("Enter Destination: ");
                        String destination = scanner.nextLine();

                        System.out.print("Enter transportationMode: ");
                        String transportationMode = scanner.nextLine();

                        System.out.print("Enter Price: ");
                        double price = scanner.nextDouble();
                        
                        

                        System.out.println(
                        		travelController.TraveladdTravel(new Travel(id, destination, transportationMode, price))
                        );
                        break;

                    case 2:
                        Iterable<Travel> travel = travelController.retrieveAllTravels();
                        if (travel==null) {
                            System.out.println("No Records Found.");
                        } else {
                            travel.forEach(System.out::println);
                        }
                        break;

                 

                    case 3:
                        System.out.print("Enter ID to Delete: ");
                        Long deleteId = scanner.nextLong();

                        System.out.println(
                        		travelController.findTravelById(deleteId)
                        );
                        break;



                    case 4:
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