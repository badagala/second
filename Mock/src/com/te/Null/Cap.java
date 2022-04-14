package com.te.Null;

import java.util.ArrayList;

public class Cap {

	public static void main(String[] args) {
		ArrayList<Home> list = new ArrayList<>();
		
		Home h1 = new Home("Srikakulam",3);
		Home h2 = new Home("Palasa",2);
		
		list.add(h1);
		list.add(h2);
		
		System.out.println(list);
		

	}

}
