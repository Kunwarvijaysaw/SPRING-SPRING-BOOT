package com.kvs.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.kvs.main.model.Notification;
import com.kvs.main.service.NotificationService;

@SpringBootApplication
public class BootProj008ProfileNotificationSystemApplication implements CommandLineRunner{
	
	@Autowired
	NotificationService notificationService;

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(BootProj008ProfileNotificationSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		notificationService.sendNotification(new Notification("Good Morning", 1, "Kunwar Vijay Saw"));
		
	}
	
}
