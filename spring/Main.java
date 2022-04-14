package com.techno.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	
	public static void main(String[] args) {
		
//		ApplicationContext context= new ClassPathXmlApplicationContext("com/techno/spring/spring.xml");
//		Showroom room = context.getBean("showroom",Showroom.class);
//		System.out.println(room);
//		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/techno/spring/spring.xml");
		Showroom show=context.getBean("Showroom",Showroom.class);
		System.out.println(show);
	}

}
