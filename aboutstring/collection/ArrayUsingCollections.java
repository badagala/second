package com.te.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayUsingCollections {

	public static void main(String[] args) {
		
		ArrayList ar=new ArrayList();
		ar.add("loki");
		ar.add("vijay");
		ar.add("swamy");
		ar.add("ravi");
		System.out.println(ar);
		
		Collections.sort(ar);
		System.out.println(ar);
		Collections.reverse(ar);
		System.out.println(ar);
	

	}

}
