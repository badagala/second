package com.te.collection;

import java.util.LinkedHashMap;

/*• LinkedHashMap is a class which extends HashMap and implements Map 
interface. 
Features 
• introduced in 1.4v 
• heterogenous data allowed 
• Data structure is hashtable 
• duplicate keys are not allowed but values can be duplicate,if we add 
duplicate key it 
• replaces with original one. 
• As per Insertion order 
• only one null key is allowed and multiple null values are allowed.
//Only difference is output is as per insertion order/
*/
public class LinkedhashMap {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> lhm=new LinkedHashMap<>();
		lhm.put(1, "Ravi");
		lhm.put(2, "Teja");
		lhm.put(3, "Aneeth");
		lhm.put(4, "Sagar");
		System.out.println("After adding elements:"+lhm);
		lhm.put(1, "Ravi");
		lhm.put(null, null);
		lhm.put(1, null);
		lhm.put(null, "Girish");
		System.out.println("After adding null and duplicate elements"+lhm);

	}

}
