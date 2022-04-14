package com.techno.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Vehicle vehicle= context.getBean("vehicle",Vehicle.class);
		System.out.println(vehicle);
		
	}

}
