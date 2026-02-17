package com.kvs.service;

import org.springframework.stereotype.Component;

@Component
public class NumberService {
	
	
	public String checkEvenOdd(int number) {
		if(number%2==0) {
			return "even";
		}else {
			return "odd";
		}
		 
		
	}
	


}
