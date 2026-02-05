package com.kvs.sbeans;

import org.springframework.stereotype.Component;

@Component("sms")
public class SMSNotification implements NotificationStrategy {

	@Override
	public void send(String message) {
		System.out.println("SMS: "+message);
		
	}

}
