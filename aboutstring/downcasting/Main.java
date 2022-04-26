package com.te.downcasting;

public class Main {

	public static void main(String[] args) {
		
		Parent p=new Child();
//		p.hello();
//		
//		Child c=
//		c.bye();
//		
		Child c=(Child) p;
		c.bye();
		c.hello();
		

	}

}
