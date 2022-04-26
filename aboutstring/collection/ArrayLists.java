package com.te.collection;

import java.util.ArrayList;

/*While adding data in middle, ArrayList 
is slower*/
/*ArrayList is faster, when we add objects 
in the end.*/

/*It is good, if our operation is 
retrieval.*/

//Arrays are type safe but collections are not type safe

/*Since Collections are not type safe i.e programmer can add any types of 
objects there is no restriction for that so, to overcome this drawback JAVA 
has given Generics concept where you can create an object of specific type, 
if we add any other type of object than specified we will get CTE.
*/
public class ArrayLists {
	
	public static void main(String[] args) {
		ArrayList array=new ArrayList();
		
		array.add("Ravi");
		array.add(10);
		array.add('B');
		array.add(66.0);
		System.out.println("Collection of Objects:"+array);
		array.add("java");
		Integer in=new Integer(100);
		array.add(in);
		System.out.println("Collection of objects1:"+array);
		array.add(null);
		System.out.println("After adding Null:"+array);
		array.remove(3);
		System.out.println("After removing element:"+array);
		System.out.println(array.get(1));
		array.set(3,66.0);
		System.out.println("After setting value before removing element from one of the index");
		array.add(2,"loki");
		System.out.println("After adding element in second index"+array);
		System.out.println("this is the size:"+array.size());
		
		ArrayList a=new ArrayList();
		a.addAll(array);		
		System.out.println("After adding in another arraylist"+a);
		System.out.println(array.contains("Ravi"));
		System.out.println(array.isEmpty());
		
		for(int i=0;i<array.size();i++) {
			System.out.println(array.get(i));
		}
		
		
	}

}
