package com.kvs.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MvcController {
	
	@GetMapping("/welcome")
	public String getmessage() {
		return "welcome";
	}

}
