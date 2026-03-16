package com.kvs.main.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.kvs.main.BootProj017FinderStudentRecordFinderApplication;
import com.kvs.main.entity.Student;
import com.kvs.main.repository.StudentRepository;

@Component
public class StudentRunner implements CommandLineRunner {

	private final BootProj017FinderStudentRecordFinderApplication bootProj017FinderStudentRecordFinderApplication;

	@Autowired
	StudentRepository repos;

	StudentRunner(BootProj017FinderStudentRecordFinderApplication bootProj017FinderStudentRecordFinderApplication) {
		this.bootProj017FinderStudentRecordFinderApplication = bootProj017FinderStudentRecordFinderApplication;
	}

	@Override
	public void run(String... args) throws Exception {

		Scanner sc = new Scanner(System.in);
		try {

			while (true) {
				System.out.println(
						"========Menu============\n" + "1.Add Student\n" + "2.View All student\n" + "3.findByCity\n"
								+ "4.findByGradeGreaterThanEqual\n" + "5.findByFirstNameStartingWith\n" + "6.Exit");

				System.out.println("Select Option");
				int option = sc.nextInt();

				switch (option) {
				case 1:
					System.out.println("Enter Student Id:");
					Long id = sc.nextLong();
					sc.nextLine();

					System.out.println("Enter First Name:");
					String firstName = sc.nextLine();

					System.out.println("Enter Last Name:");
					String lastName = sc.nextLine();

					System.out.println("Enter Grade:");
					Integer grade = sc.nextInt();
					sc.nextLine();

					System.out.println("Enter City:");
					String city = sc.nextLine();

					System.out.println("Is Active (true/false):");
					Boolean active = sc.nextBoolean();

					List<Student> list = Arrays.asList(new Student(id, firstName, lastName, grade, city, active));
					Iterable<Student> saveAll = repos.saveAll(list);
					System.out.println("Data Added!!!");
					break;

				case 2:
					Iterable<Student> student = repos.findAll();
					if (student == null) {
						System.out.println("No Records Found.");
					} else {
						student.forEach(System.out::println);
					}

					break;
				case 3:
					sc.nextLine();
					System.out.println("Enter city");
					String city1 = sc.nextLine();
					repos.findByCity(city1).forEach(System.out::println);
					break;
				case 4:
					System.out.println("Enter grade");
					Integer grade1 = sc.nextInt();
					repos.findByGradeGreaterThanEqual(grade1).forEach(System.out::println);
					break;

				case 5:
					System.out.println("Enetre first name");
					String fname = sc.next();
					repos.findByFirstNameStartingWith(fname).forEach(System.out::println);
					break;

				case 6:
					System.out.println("Exit the programm..........");
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
