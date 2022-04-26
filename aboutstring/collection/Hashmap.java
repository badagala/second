package com.te.collection;

import java.util.HashMap;

/*HashMap is a class which implements Map interface. 
Features 
• introduced in 1.2v 
• heterogenous data allowed 
• Data structure is hashtable 
• duplicate keys are not allowed but values can be duplicate 
• random order based on hashcode 
• only one null key is allowed and multiple null values are allowed
*/
public class Hashmap {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> ha =new HashMap<>();
		ha.put(1, "Ravi");
		ha.put(2, "Teja");
		ha.put(3, "Aneeth");
		ha.put(5, "Sagar");
		
		
		System.out.println("After adding elements:"+ha);
		ha.put(6, "Ravi");
		ha.put(null, "Ravi");
		System.out.println("After adding duplicates"+ha);
		
		System.out.println("After adding Null values");
		ha.put(null, null);
		
		System.out.println("All Keys:"+ha.keySet());
		System.out.println("All Keys:"+ha.values());
		System.out.println("Particular Value:"+ha.get(3));
		System.out.println("Check value:"+ha.containsKey(1));
		
		
	}

}
