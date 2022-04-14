package com.te.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
	ApplicationContext con = new ClassPathXmlApplicationContext("com/te/injection/NewFile.xml");
	Marwadi mar=con.getBean("marwadi",Marwadi.class);
	System.out.println(mar);
		
	}
	}


