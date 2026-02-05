package com.kvs.sbeans;

import org.springframework.stereotype.Component;

@Component("email")
public class EmailNotification implements NotificationStrategy {

	@Override
	public void send(String message) {
		System.out.println("Email : "+message);
		
		
	}

}
