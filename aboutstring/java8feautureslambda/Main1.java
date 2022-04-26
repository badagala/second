package com.te.java8feautureslambda;

public class Main1 {

	public static void main(String[] args) {
		String pen="Bluepen";
		
		Note n=()->{
			System.out.println("Writing with"+ pen);
		};
		
		n.write();

	}

}
//by using lambda expression

//with no parameters
//It provides a clear and concise way to represent one method interface using an expression. 
//It is very useful in collection library. It helps to iterate, filter and extract data from collection.

/*
 * The Lambda expression is used to provide the implementation of an interface
 * which has functional interface. It saves a lot of code. In case of lambda
 * expression, we don't need to define the method again for providing the
 * implementation. Here, we just write the implementation code.
 * 
 * Lambda expression provides implementation of functional interface. An interface which has only one abstract method is called functional interface. 
 * Java provides an anotation @FunctionalInterface, which is used to declare an interface as functional interface.
 * 
 * 
 * Why use Lambda Expression
To provide the implementation of Functional interface.
Less coding
 */