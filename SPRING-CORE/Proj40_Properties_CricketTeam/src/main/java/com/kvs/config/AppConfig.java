package com.kvs.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.kvs")
@PropertySource("com/kvs/properties/player.properties")
public class AppConfig {

}
