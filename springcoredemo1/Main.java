package com.techno.springcoredemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/techno/springcoredemo1/collectionNewFile.xml");
		// Employee emp=(Employee) context.getBean("employee");
		Employee e = context.getBean("emp1", Employee.class);
		System.out.println(e);
	}

}
