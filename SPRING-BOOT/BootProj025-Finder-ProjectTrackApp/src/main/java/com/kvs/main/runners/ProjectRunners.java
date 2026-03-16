package com.kvs.main.runners;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kvs.main.entity.Project;
import com.kvs.main.repository.ProjectRepository;
@Component
public class ProjectRunners implements CommandLineRunner{
	@Autowired
	ProjectRepository projectRepository;

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
					
			}
			
			
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
