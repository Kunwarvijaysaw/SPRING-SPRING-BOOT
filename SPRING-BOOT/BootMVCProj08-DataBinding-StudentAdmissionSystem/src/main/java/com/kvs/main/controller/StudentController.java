package com.kvs.main.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kvs.main.model.Student;

@Controller
public class StudentController {
	
	@GetMapping("/")
	public String studentFormDetails() {
		
		return "student_form";
		
	}
	
	@PostMapping("/student_formdata")
	public String studentDetails(@RequestParam("name")String name,
			@RequestParam("rollNo")Integer rollNo,
			@RequestParam("marks1")Integer marks1
			,@RequestParam("marks2")Integer marks2,
			@RequestParam("marks3")Integer marks3,
			Map<String, Object> map) {
		System.out.println(rollNo+" - "+name+" - "+marks1+" - "+marks2+" - "+marks3);
		Student std = new Student(name, rollNo, marks1, marks2, marks3);
				map.put("student", std);
		return "show_result";
		
	}

}
