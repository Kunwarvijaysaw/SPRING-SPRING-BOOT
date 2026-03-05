package com.kvs.main;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.kvs.main.repository.ProducrRepository;
import com.kvs.main.service.IProductService;
import com.kvs.main.service.ProductService;

@SpringBootApplication
public class BootProj015PagingAndSortingECommerceProductApplication implements CommandLineRunner {

  
	public static void main(String[] args) {
		SpringApplication.run(BootProj015PagingAndSortingECommerceProductApplication.class, args);
	}
	
	@Autowired
	IProductService service;
	
	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {

            System.out.println("1. Add All product list\n"
            		+"2. View sorted product list\n"
            		+ "3. View paginated product list\n"
            		+"4.Exiting Application...");
            
            
            System.out.println("Enter Choice");
            int choice = scanner.nextInt();

            try {

                switch (choice) {

                case 1:
                	service.addAll();
                	break;
                    case 2:
                        service.getAllProductsSorted("id", true).forEach(System.out::println);
                        break;

                    case 3:
                        service.getPagedProducts(1, 3, "category", false).forEach(System.out::println);
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


