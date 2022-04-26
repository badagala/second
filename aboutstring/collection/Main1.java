package com.te.collection;

import java.util.ArrayList;

public class Main1 {
	
	public static void main(String[] args) {
		
		ArrayList<Object> obj=new ArrayList();
		obj.add(new Student("loki",10));
		obj.add(new Student("swamy",20));
		obj.add(new Animal("Lion","Yellow"));
		obj.add(new Animal("Elephant","Black"));
		
		System.out.println(obj);
		
		for(Object obj1:obj) {
		if(obj1 instanceof Student) {
			Student s1=(Student)obj1;
			System.out.println(s1.name+" "+s1.id);
			
			
		}if(obj1 instanceof Animal) {
			Animal a1=(Animal)obj1;
			System.out.println(a1.name+" "+a1.color);
			
		}
		}
	}

}
