package com.techno.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext con = new AnnotationConfigApplicationContext(Teacher.class);
		Teacher teach = con.getBean("teacher",Teacher.class);
		System.out.println(teach);
		
	}

}
