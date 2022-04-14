package com.techno.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.techno.core")
public class Config {
	
	@Bean(name= {"vehicle"})
	public Vehicle getvehicle() {
		
	return new Vehicle();
	}

}
