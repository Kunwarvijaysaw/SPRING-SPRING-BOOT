package com.kvs.main;

import java.util.Scanner;
import com.kvs.main.repository.TravelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kvs.main.controller.TravelController;
import com.kvs.main.entity.Travel;

@SpringBootApplication
public class BootProj013JpaTravelBookingManagementSystemApplication implements CommandLineRunner {

    private final TravelRepository travelRepository;

    BootProj013JpaTravelBookingManagementSystemApplication(TravelRepository travelRepository) {
        this.travelRepository = travelRepository;
    }

	public static void main(String[] args) {
		SpringApplication.run(BootProj013JpaTravelBookingManagementSystemApplication.class, args);
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
            System.out.println("4.Delete a travel booking by ID.");
            System.out.println("5.Check if a travel booking exists.");
            System.out.println("6.Count total travel bookings.");
            System.out.println("7.Delete a specific travel booking.");
            System.out.println("8.Delete all travel bookings.");
            System.out.println("9. Exit");
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
                        
                        

                        
                        		travelController.addTravel(new Travel(id, destination, transportationMode, price));
                       
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
                        System.out.print("Enter ID to Find Travel ");
                        Long findId = scanner.nextLong();

                 		travelController.findTravelById(findId);
                     
                        break;
                    case 4:
                    	System.out.print("Enter ID to delete Travel ");
                        Long deleteId = scanner.nextLong();
                        travelController.deleteTravelById(deleteId);
                    	break;
                    	
                    case 5:
                    	System.out.println("Enter Id to find exit");
                    	 Long exitId = scanner.nextLong();
                         travelController.checkIfTravelExists(exitId);
                    	break;
                    	
                    case 6:
                    	System.out.println("Enter count");
                    	travelController.countTravels();
                    	break;
                    	
                    case 7:
                    	System.out.print("Enter ID: ");
                        long id1 = scanner.nextLong();
                        scanner.nextLine(); // clear buffer

                        System.out.print("Enter Destination: ");
                        String destination1 = scanner.nextLine();

                        System.out.print("Enter transportationMode: ");
                        String transportationMode1 = scanner.nextLine();

                        System.out.print("Enter Price: ");
                        double price1 = scanner.nextDouble();
                        
                    	 
                    	travelController.deleteTravelObject(new Travel(id1, destination1, transportationMode1,  price1 ));
                    	break;
                    case 8:
                    	travelController.deleteAllTravels();
                    	break;
                    	
                    case 9:
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