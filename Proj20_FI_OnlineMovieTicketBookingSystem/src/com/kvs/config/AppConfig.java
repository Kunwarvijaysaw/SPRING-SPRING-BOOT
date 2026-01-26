package com.kvs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.kvs.sbeans.TicketDetails;
@Configuration
@ComponentScan(basePackages = "com.kvs")
public class AppConfig {

	@Bean("td")
	public TicketDetails getTicketDetails()
	{
		return new TicketDetails(200, 3, 10);
	}
	
}
