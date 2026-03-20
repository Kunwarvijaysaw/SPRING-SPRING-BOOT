package com.kvs.main.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kvs.main.entity.Course;
import com.kvs.main.entity.University;
import com.kvs.main.repository.UniversityRepository;

@Component
public class DataLoader implements CommandLineRunner{

	@Autowired
	UniversityRepository urepo;

	@Override
	public void run(String... args) throws Exception {
		
		University u = new University();
		u.setUniversityId(101l);
		u.setUniversityName("XYZ College");
		u.setLocation("HYD");
		
		Course c1 = new Course();
		c1.setCourseId(1011l);
		c1.setCourseName("Java");
		c1.setDuration("6 Months");
		c1.setUniversity(u);
		
		Course c2 = new Course();
		c2.setCourseId(1012l);
		c2.setCourseName("Spring");
		c2.setDuration("3 Months");
		c2.setUniversity(u);
		
		Course c3 = new Course();
		c3.setCourseId(1013l);
		c3.setCourseName("Python");
		c3.setDuration("4 Months");
		c3.setUniversity(u);
		
		
		List<Course> list = List.of(c1,c2,c3);
		u.setCourses(list);
		
		University university = urepo.save(u);
		if(university!=null)
		System.out.println("Data Added!!!");
		else
		System.out.println("Data not Added!!!");
		
		List<University> all = urepo.findAll();
		
		for(University university2:all) {
			System.out.println(university2);
		}
		
		
		
		
		
		
		
	}
	
	
}
