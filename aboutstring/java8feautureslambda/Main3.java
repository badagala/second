package com.te.java8feautureslambda;

import java.util.ArrayList;
import java.util.stream.Stream;

//By using lambda expression using comparator and using stream api

public class Main3 {

	public static void main(String[] args) {
		
		ArrayList<Mobile> array=new ArrayList<Mobile>();
		array.add(new Mobile(1,"Samsung","6","64gb"));
		array.add(new Mobile(5,"Vivo","8","220gb"));
		array.add(new Mobile(4,"Oppo","12","84gb"));
		array.add(new Mobile(3,"OnePlus","16","124gb"));
		array.add(new Mobile(2,"Nokia","4","32gb"));
		
	/*Collections.sort(array,(m1,m2)->{
		return m1.getId().compareTo(m2.getId());
	});
	
	array.forEach((n)->System.out.println(n));
	}
*/
		Stream<Mobile> data=array.stream().filter(m->m.getId()>3);
		
		data.forEach((Mobile)->System.out.println(Mobile));
	}
}
