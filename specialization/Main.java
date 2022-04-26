package com.te.specialization;
//The process of developing a method which handles only one type of object such methods are called as special methods and process is called as specialisation.

public class Main {

	public static void main(String[] args) {
		dogDetails(new Dog());
		catDetails(new Cat());

	}
	
//The main disadvantage of specialisation is, methods will handle only one type of object.
	private static void dogDetails(Dog d) {//Dog d=new Dog();
		d.eat();
		d.sound();
		
	}


	private static void catDetails(Cat c) {
		
		c.eat();
		c.sound();
	}
	//Therefore, to overcome this problem we go for generalisation

}
