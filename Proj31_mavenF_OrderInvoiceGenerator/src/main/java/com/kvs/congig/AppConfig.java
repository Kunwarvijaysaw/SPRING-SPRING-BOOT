package com.kvs.congig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.kvs.service.Product;

@Configuration
@ComponentScan(basePackages = "com.kvs.service")
public class AppConfig {
	
	
	@Bean
	public Product getProduct() {
		Product product=new Product();
		product.setName("Laptop");
		product.setPrice(50000);
		product.setQuntity(2);
		return product;
		
	}

}
