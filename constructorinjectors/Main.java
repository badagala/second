package com.te.constructorinjectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("com/te/constructorinjectors/NFile.xml");
		Marwadi mav=con.getBean("marwadi",Marwadi.class);
		System.out.println(mav);

	}

}
