package com.te.collection;

import java.util.LinkedList;
import java.util.Queue;

/*LinkedList is faster, when we add 
object in middle.
LinkedList is slower, when we add 
objects in end.*/
/*It is good, if our operation is 
insertion and deletion.*/
/*• Introduced in 1.2 version.
• Hetrogenous objects are allowed.
• Null objects are allowed.
• Insertion order is preserved.
• Duplicate objects are allowed.
• Data structure is doubly LinkedList.
• cursors - ListIterator and Iterator
• Same process to write program, only in place of arraylist object
create object of linkedlist.
Vector*/
//LinkedList is a class which implements List as well as Queue Interface
public class Linkedlist {
	
	public static void main(String[] args) {
		
		Queue qu=new LinkedList();
		
		qu.add("aneeth");
		qu.add("jagan");
		qu.add("girish");
		qu.add("manikanta");
		
		System.out.println(qu.peek());
		System.out.println(qu.poll());
		System.out.println(qu);
		
	}

}
