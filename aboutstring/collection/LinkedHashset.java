package com.te.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

/*It is a class which extends HashSet and implements set interface. 
Features: 
• Introduced in 1.2v 
• Heterogenous objects are allowed 
• Duplicates are not allowed. In case if we add we won't get compile 
time error, it will just add once 
• only one NULL object is allowed 
• Data structure is Linkedlist. 
• Insertion order is preserved. 
• Set is only uni directional so it supports only Iterator
*/
public class LinkedHashset {

	public static void main(String[] args) {
		
		LinkedHashSet<Object> link=new LinkedHashSet<>();
		link.add("Ravi");
		link.add("Teja");
		link.add(200);
		link.add(200.10);
		link.add("Aneeth");
		System.out.println("Output is:"+link);
		link.add("Ravi");
		link.add("Teja");
		System.out.println("After adding duplicates:"+link);
		link.add(null);
		link.add(null);
		System.out.println("After adding Null :"+link);
		System.out.println("------------After fowarding-------");
		Iterator<Object> itr=link.iterator();
		while(itr.hasNext()) {
			System.out.println("Using Iterator:"+itr.next());
		}
		

	}

}
