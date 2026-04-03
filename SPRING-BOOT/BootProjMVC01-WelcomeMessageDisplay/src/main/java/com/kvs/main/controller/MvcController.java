package com.kvs.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mvc/app")
public class MvcController {

	@GetMapping("/welcome")
	public String getmessage() {
		return "welcome.jsp";
	}

}
