package com.kvs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
@ComponentScan(basePackages = "com.kvs.services")

public class AppConfig {
	
	@Bean("messageSource")
	public ResourceBundleMessageSource bundleMessageSource() {
		ResourceBundleMessageSource bundleMessageSource=new ResourceBundleMessageSource();
		bundleMessageSource.setBasename("com/kvs/properties/messages");
		return bundleMessageSource;
	}

}
