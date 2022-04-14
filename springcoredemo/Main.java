package com.techno.springcoredemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main{
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/techno/springcoredemo/NewFile.xml");
		Student s1 = context.getBean("student1", Student.class); 
		Student s2 = context.getBean("student2", Student.class); 
		Student s3 = context.getBean("student3", Student.class); 
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}
	


   
}
