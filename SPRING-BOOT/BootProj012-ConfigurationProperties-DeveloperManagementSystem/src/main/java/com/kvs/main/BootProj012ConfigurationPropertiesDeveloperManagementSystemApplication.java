package com.kvs.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kvs.main.config.AppConfig;

@SpringBootApplication
public class BootProj012ConfigurationPropertiesDeveloperManagementSystemApplication implements CommandLineRunner {

	@Autowired
    private AppConfig appConfig;
	
	public static void main(String[] args) {
		SpringApplication.run(BootProj012ConfigurationPropertiesDeveloperManagementSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("===== Application Configuration =====");
        System.out.println("App Name      : " + appConfig.getName());
        System.out.println("Version       : " + appConfig.getVersion());
        System.out.println("Developer     : " + appConfig.getDeveloper());
        System.out.println("Support Email : " + appConfig.getSupportEmail());
		
	}

}
