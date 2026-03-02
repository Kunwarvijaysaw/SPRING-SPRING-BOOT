package com.kvs.main.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties(prefix = "app")
@Data
public class AppConfig {
	
	 private String name;
	    private String version;
	    private String developer;
	    private String supportEmail;
		
	    

}
