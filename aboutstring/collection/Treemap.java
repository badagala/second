package com.te.collection;

import java.util.TreeMap;

/*• TreeMap is a class which implements Map interface. 
Features 
• introduced in 1.2v 
• only homogenous data allowed ,if we add heterogeneous objects will 
get class cast exception 
• Data structure is Tree 
• duplicate keys are not allowed but values can be duplicate 
• sorting order. 
• Null keys are not allowed.*/

public class Treemap {
	
	public static void main(String[] args) {
		TreeMap<Integer, String> tree=new TreeMap<>();
		tree.put(1, "Ravi");
		tree.put(2, "Teja");
	    tree.put(5, "Aneeth");
	    tree.put(4, "Sagar");
	    tree.put(6, "Jagan");
	    
	    System.out.println("After adding elements:"+tree);
//	    tree.put(1, null);
//	    tree.put(null, "Ravi");
//	    System.out.println("After adding null elements in key and value"+tree);
//	    tree.put(null, null);
	    tree.put(7, "sagar");
	    System.out.println("After adding null elements and duplicate in value:"+tree);
	}

}
