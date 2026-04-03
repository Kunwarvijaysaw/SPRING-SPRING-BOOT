package com.kvs.main.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.kvs.main.entity.Feedback;



@Controller
public class FeedbackController {
	
	@GetMapping("/feedback")
	public String showFeedbackForm(Map<String, Object> map) {
		Feedback feedback=new Feedback();
		feedback.setName("KVS");
		feedback.setEmail("kvs143@gmail.com");
		feedback.setRating(5);
		feedback.setComments("Good Performance");
		map.put("object",feedback);
		return "information";
	}
	

}
