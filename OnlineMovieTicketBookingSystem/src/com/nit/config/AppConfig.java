package com.nit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.sbean.TicketDetails;

@Configuration
@ComponentScan(basePackages = "com.nit")
public class AppConfig {

	@Bean("td")
	public TicketDetails getDetails()
	{
		return new TicketDetails(200, 3, 10);
	}
}
