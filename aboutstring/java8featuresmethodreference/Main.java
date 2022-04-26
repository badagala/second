package com.te.java8featuresmethodreference;

//Creating method reference 

public class Main {
	
	public static void sleepingWell() {
		System.out.println("Siva is sleeping in bathroom");
	}
	
	public static void main(String[] args) {
		
		Work w=Main::sleepingWell;
		w.sleep();
		
	}

}
