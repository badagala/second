package com.te.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListUsingListItr {
	
	public static void main(String[] args) {
		ArrayList ar=new ArrayList();
		ar.add("swamy");
		ar.add(20);
		ar.add(2515);
		ar.add("loki");
		ar.add("vijay");
		
		System.out.println("Elements are:"+ar);
		
		ListIterator li= ar.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("Objects reverse");
		
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		
	}

}
