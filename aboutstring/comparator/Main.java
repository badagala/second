package com.te.comparator;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Car> array=new ArrayList<>();
		
		Car c1=new Car("Hyundai","Blue",656);		
		Car c3=new Car("Mahindra","Black",889);
		Car c4=new Car("Hyundai","Red",578);
		Car c=new Car("Hyundai","Black",263);
		Car c2=new Car("Kia","Red",585);
		
		array.add(c);
		array.add(c1);
		array.add(c2);
		array.add(c3);
		array.add(c4);
		
		//System.out.println(array);
		
		for(Car car:array) {
			System.out.println(car.getModelno());
		}
	
	}

}
