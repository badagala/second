package com.te.Constructorinj;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext cont =new ClassPathXmlApplicationContext("com/te/Constructorinj/configuFile.xml");
		Shop so = cont.getBean("shop",Shop.class);
		System.out.println(so);
		

	}

}
