package com.kvs.service;

import org.springframework.stereotype.Component;

@Component("emailService")
public class EmailNotificationService implements NotificationService {

	@Override
	public void sendNotification(String message) {
		System.out.println(message+"\n this message delivered in Email....!");
		
	}

}
