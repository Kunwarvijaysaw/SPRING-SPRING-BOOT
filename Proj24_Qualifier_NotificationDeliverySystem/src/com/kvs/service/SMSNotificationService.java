package com.kvs.service;

import org.springframework.stereotype.Component;

@Component("smsService")
public class SMSNotificationService implements NotificationService {

	@Override
	public void sendNotification(String message) {
		System.out.println(message+"\n this message delivered in SMS....!");

		
	}

}
