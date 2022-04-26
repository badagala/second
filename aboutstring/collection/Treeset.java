package com.te.collection;

import java.util.Iterator;
import java.util.TreeSet;

/*It is a class which implements set interafce.
• Introduced in 1.2v
• Heterogenous objects are not allowed if we add we will get class cast
exception
• Duplicates are not allowed .In case if we add we won't get compile
time error, it will just add once
• No NULL object is allowed
• Data structure is tree.
• Output is in Sorted Order.
• Set is only uni directional so it supports only Iterator
 In Treeset output will defaultly in sorted order 
• It allows only homogenous objects i.e it allows only comparable type 
of objects, if we add heterogeneous objects it gives ClassCastExc.
• If we add null objects it gives NullPointerException. 
• first()-->provides first object 
• last()--->provides last object 
• pollFirst()-->provides first object and delete it from tree 
• pollLast()--->provides last object and delete it from tree
*/
public class Treeset {

	public static void main(String[] args) {
		TreeSet set=new TreeSet();
		set.add("Ravi");
		set.add("Aneeth");
		set.add("sagar");
		set.add("Girish");
		
		//set.add(200);
		set.add("Teja");
		//set.add(2001.10);
		//System.out.println("Aftern adding elements :"+set);
		//set.add("Ravi");
		//set.add("Teja");
		//System.out.println("After adding duplicates:"+set);
		//set.add(null);
		//set.add(null);
		//System.out.println("After adding null values:"+set);
		System.out.println("USing iterator");
		
		Iterator itr =set.iterator();
		while(itr.hasNext()) {
			System.out.println("After Iterating:"+itr.next());
		}

	}

}
