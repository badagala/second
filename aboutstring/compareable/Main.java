package com.te.compareable;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Bike> arr=new ArrayList<>();
		
		
		Bike b2=new Bike(220,"Yamaha","Red&Black");
		Bike b=new Bike(120,"Honda","Black");
		Bike b1=new Bike(150,"Suzuki","Red");
		
		arr.add(b);
		arr.add(b1);
		arr.add(b2);
		for(Bike bike:arr) {
			
			System.out.println(bike.getCc());
			
		}

	}

}
