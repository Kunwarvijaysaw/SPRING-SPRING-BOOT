package com.kvs.main.runner;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import com.kvs.main.BootProj017FinderAndQueryProjectTrackerAppApplication;
import com.kvs.main.entity.Project;
import com.kvs.main.repository.ProjectRepository;

@Service
public class ProjectRunner implements CommandLineRunner{

    private final BootProj017FinderAndQueryProjectTrackerAppApplication bootProj017FinderAndQueryProjectTrackerAppApplication;

	@Autowired
	ProjectRepository projectRepository;

    ProjectRunner(BootProj017FinderAndQueryProjectTrackerAppApplication bootProj017FinderAndQueryProjectTrackerAppApplication) {
        this.bootProj017FinderAndQueryProjectTrackerAppApplication = bootProj017FinderAndQueryProjectTrackerAppApplication;
    }
	
	@Override
	public void run(String... args) throws Exception {
		
		Scanner sc=new Scanner(System.in);
		
		try {
			
			while(true) {
				System.out.println("\n===========Menu===========");
				System.out.println("1.Add Project");
				System.out.println("2.View All Project");
				System.out.println("3.Find Projects starting after");
				System.out.println("4.Find Projects ending before");
				System.out.println("5.Projects where budget > 1 crore");
				System.out.println("6.Completed projects");
				System.out.println("7.Ongoing projects");
				System.out.println("8.Client names starting with “I” ");
				System.out.println("9.Project names containing “Cloud”");
				System.out.println("10.Top 3 projects by budget");
				System.out.println("11.Exit");
				
				
				System.out.println("Select Option");
				int option=sc.nextInt();
				
				switch (option) {
				
				case 1:
					System.out.print("Enter Project Id: ");
			        Long id = sc.nextLong();
			        sc.nextLine();

			        System.out.print("Enter Project Name: ");
			        String projectName = sc.nextLine();

			        System.out.print("Enter Client Name: ");
			        String clientName = sc.nextLine();

			        System.out.print("Enter Start Date (YYYY-MM-DD): ");
			        LocalDate startDate = LocalDate.parse(sc.next());

			        System.out.print("Enter End Date (YYYY-MM-DD): ");
			        LocalDate endDate = LocalDate.parse(sc.next());

			        System.out.print("Enter Budget: ");
			        Double budget = sc.nextDouble();

			        System.out.print("Is Project Completed (true/false): ");
			        Boolean completed = sc.nextBoolean();
			        
			        List<Project> list =Arrays.asList(new Project(id,projectName,clientName,startDate,endDate,budget,completed));
			        Iterable<Project> save = projectRepository.saveAll(list);
			        System.out.println(id+" Project save Sucessfully....... ");
			        break;
			        
				case 2:
					Iterable<Project> proj= projectRepository.findAll();
					if(proj == null) {
						System.out.println("No Record found..");
					}else {
						proj.forEach(System.out::println);
					}
					break;
					
					
				case 3:
					System.out.print("Enter Start Date (YYYY-MM-DD): ");
			        LocalDate startDate1 = LocalDate.parse(sc.next());
					
					projectRepository.findByStartDateAfter(startDate1).forEach(System.out::println);
					break;
					
				case 4:
					System.out.print("Enter End Date (YYYY-MM-DD): ");
			        LocalDate endDate1 = LocalDate.parse(sc.next());
					
					projectRepository.findByEndDateBefore(endDate1).forEach(System.out::println);
					break;
					
				case 5:
					System.out.println("Enter budget");
					Double budget1=sc.nextDouble();
					projectRepository.findByBudgetGreaterThan(budget1).forEach(System.out::println);
					break;
					
					
				case 6:
					System.out.println("Find Completed Project");
					projectRepository.findByCompletedTrue().forEach(System.out::println);
					break;
					
				case 7:
					System.out.println("Find not Completed Project");
					projectRepository.findByCompletedFalse().forEach(System.out::println);
					break;
					
				case 8:
					System.out.print("Enter Name of First Latter: ");
			        String nameOfFirstLatter = sc.next();
			        projectRepository.findByClientNameStartingWith(nameOfFirstLatter).forEach(System.out::println);
			        break;
			        
				case 9:
					System.out.println("Enter word to check itcontains project name ");
					sc.nextLine();
					String nameContains=sc.nextLine();
					projectRepository.findByProjectNameContainingIgnoreCase(nameContains).forEach(System.out::println);
					break;
					
				case 10:
					projectRepository.findTop3ByOrderByBudgetDesc().forEach(System.out::println);
					break;
					
				case 11:
					System.out.println("Program Sucessfully exit.......");
					System.exit(0);
				}
			}
			
			
		} catch (Exception e) {
			System.out.println("Error : " + e.getMessage());

		}
		sc.close();
        System.out.println("Application Closed Successfully.");

		
	}

}
