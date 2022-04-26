package com.te.methods;

public class Car {
	
	String name="loki";
	String Area="pundi";
	int id=1;
	double db=10000.00;
	
	public void area() {
		
		System.out.println("Entered the name:"+name);
		System.out.println("Entered the id:"+id);
		System.out.println("Entered the Area:"+Area);
		System.out.println("Entered the amount:"+db);
	}

	public static void main(String[] args) {
		System.out.println("");
		sit();
		
	}
		
		public static void sit() {
			Car car=new Car();
			car.area();
			System.out.println("Printing ALL the entered details");
		}
		 

	}


