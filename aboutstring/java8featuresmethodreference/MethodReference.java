package com.te.java8featuresmethodreference;

//creating a thread by using method reference

/*Java provides a new feature called method reference in Java 8. Method reference is used to refer method of functional interface. 
It is compact and easy form of lambda expression. 
Each time when you are using lambda expression to just referring a method, you can replace your lambda expression with method reference

The biggest benefit of the method reference or constructor reference is that they make the code even shorter by eliminating lambda expression, which makes the code more readable
*/
public class MethodReference {
	public static void creatingThread() {
		System.out.println("Thread is Running");
	}

	public static void main(String[] args) {
		
		Thread t1=new Thread(MethodReference::creatingThread);
		t1.start();

	}

}
