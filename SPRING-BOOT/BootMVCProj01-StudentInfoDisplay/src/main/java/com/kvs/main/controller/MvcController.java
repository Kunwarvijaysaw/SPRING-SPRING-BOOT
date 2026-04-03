package com.kvs.main.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kvs.main.entity.Student;

@Controller

public class MvcController {
	
	@GetMapping("/student")
	public String studentInfo(Map<String, Object> map) {
		Student s1=new Student("Kumar","MC/23/25","MCA");
		map.put("s", s1);
		return "student";
	}
	

}
