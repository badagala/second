package com.te.generalization;
//The process of developing a method which can handles any type of object, is called as general method and this process is known as generalisation.

public class Main {

	public static void main(String[] args) {
		
		animal(new Dog());
		animal(new Cat());
		animal(new Monkey());
		
	}
// Using Generalisation + Upcasting + Method overriding, we can achieve RunTime Polymorphism.
	private static void animal(Monkey monkey) {
		monkey.eat();
		monkey.sleep();
		
	}
//So RunTime Polymorphism is a combination of Method Overriding, Upcasting 	and Generalisation.
	private static void animal(Cat cat) {
		cat.eat();
		cat.sleep();
		
	}

	private static void animal(Dog dog) {
		dog.eat();
		dog.sleep();
		
	}

}
