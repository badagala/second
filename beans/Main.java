package com.techno.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Configurations.class);
		Area a=context.getBean("area",Area.class);
		System.out.println(a);
		
		
		

	}

}
