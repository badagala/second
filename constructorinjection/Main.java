package com.te.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/te/constructorinjection/ConstructorFile.xml");
		Person p = con.getBean("person1", Person.class);
		System.out.println(p);
	}

}
