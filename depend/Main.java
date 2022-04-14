package com.te.depend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/te/depend/addFile.xml");
		Student std = context.getBean("student",Student.class);
		System.out.println(std.getName());
		
	}

}
