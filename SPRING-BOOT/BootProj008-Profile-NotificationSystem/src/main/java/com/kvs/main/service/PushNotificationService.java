package com.kvs.main.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.kvs.main.model.Notification;


@Service
@Profile("prod")
public class PushNotificationService implements NotificationService {

	@Override
	public void sendNotification(Notification n) {
		System.out.println("Sending Email to " 
                + n.getRecipient() + ": " 
                + n.getMessage());
		
	}

}
