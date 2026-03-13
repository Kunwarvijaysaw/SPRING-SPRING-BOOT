package com.kvs.main.runners;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kvs.main.entity.Product;
import com.kvs.main.service.ProductService;


@Component
public class ProductRunners implements CommandLineRunner{
	@Autowired
	ProductService productService;
	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		try {
			while(true) {
				
				 System.out.println("\n===== Product Management =====");
		            System.out.println("1. Add Product");
		            System.out.println("2. View All Add Product");
		            System.out.println("3. Find By Category");
		            System.out.println("4. Find All Available Product");
		            System.out.println("5. Find products with price greater than given value");
		            System.out.println("6. Find products ordered by price descending");
		            System.out.println("7.Count total available products");
		            System.out.println("8. Exit");

		            System.out.print("Enter Choice: ");
		            int choice = sc.nextInt();

		            switch(choice) {

		            case 1:
		            	System.out.println("Enter Id:");
		                Long id = sc.nextLong();
		                sc.nextLine(); // consume newline

		                System.out.println("Enter Name:");
		                String name = sc.nextLine();

		                System.out.println("Enter Category:");
		                String category = sc.nextLine();

		                System.out.println("Enter Price:");
		                Double price = sc.nextDouble();

		                System.out.println("Is Available (true/false):");
		                Boolean available = sc.nextBoolean();
		                
		              Product p= new Product(id, name, category, price, available);
		              productService.save(p);
		               System.out.println(id+" Project save Sucessfully....... ");
				        break;
				        
		            case 2:
		            	Iterable<Product> product= productService.findAll();
		            	if(product==null) {
		            		System.out.println("No Record Found");
		            	}else {
		            		product.forEach(System.out::println);
		            	}
		            	break;
		            	
		            case 3:
		            	sc.nextLine();
		            	System.out.println("Enter Categories");
		            	String categories=sc.nextLine();
		            	productService.getProductsByCategory(categories).forEach(System.out::println);
		            	break;
		            	
		            case 4:
		            	productService.getAvailableProducts().forEach(System.out::println);
		            	break;
		            	
		            	
		            case 5:
		            	System.out.println("Enter Price to find");
		            	double price1=sc.nextDouble();
		            	productService.getProductsCostlierThan(price1).forEach(System.out::println);
		            	break;
		            	
		            case 6:
		            	productService.getAllProductsSortedByPriceDesc().forEach(System.out::println);
		            	break;
		            	
		            case 7:
		            	System.out.println("Available Product Count: " + productService.getAvailableProductCount());
		                break;
		                
		            case 8:
		            	System.out.println("Program sucessfully Exit...");
		            	System.exit(0);
				
			}
			
			
			
		} 
			
		}catch (Exception e) {
			System.out.println("Error : "+e.getMessage());
		}
		sc.close();
	}

}
