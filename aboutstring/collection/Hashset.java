package com.te.collection;


/*Duplicates are not allowed. In case if we add, we won't get compile 
time error, it will just add once. 
 Only one NULL object is allowed.
 Data structure is hashtable. 
Insertion order is preserved(depends on hashcode number).
*/
import java.util.HashSet;

public class Hashset {
	
	public static void main(String[] args) {
		
		HashSet set=new HashSet();
		set.add("ravi");
		set.add(null);
		set.add("ravi");
		set.add("loki");
		set.add("vijay");
		
		System.out.println("Objects are:"+set);
	}

}
