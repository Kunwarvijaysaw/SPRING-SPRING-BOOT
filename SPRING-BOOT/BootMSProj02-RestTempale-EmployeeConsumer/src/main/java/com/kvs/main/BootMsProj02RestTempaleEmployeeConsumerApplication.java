package com.kvs.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BootMsProj02RestTempaleEmployeeConsumerApplication {
	
	@Bean
	public RestTemplate name() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(BootMsProj02RestTempaleEmployeeConsumerApplication.class, args);
	}

}
