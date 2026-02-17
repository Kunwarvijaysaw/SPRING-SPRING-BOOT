package com.kvs.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kvs.config.AppConfig;
import com.kvs.sbeans.NotificationService;

public class NotificationMainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		NotificationService service=ctx.getBean(NotificationService.class);
		service.notifyUser("Hello have a nice day.......😊");
	}

}
