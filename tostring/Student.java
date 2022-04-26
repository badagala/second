package com.te.tostring;

/*• it's a method of object class. 
• Whenever we call hashcode() on any object, it prints the hashcode 
number for given object. 
• Hashcode number is simply a 32bit integer number. 
• it is a unique number allocated to every object by JVM. 
• if the object address are same they will have same hashcode number.*/


/*it's a method of object class. 
• When we call toString()on any object, it provides complete 
information of an object. 
• Complete information consists of 
packagename.classname@objectaddress 
 Ex:mypackage.Sample@zzh33453*/

public class Student {

	String name;
	int id;
	
	public Student(String name,int id) {
		this.name=name;
		this.id=id;
		
	}
	public String toString() {
		return name;
	}
	public int hashCode() {
		return id;
	}
	public static void main(String[]args) {
		Student s1=new Student("Loki",1);
		System.out.println(s1.toString());
		System.out.println(s1.hashCode());
		Student s2=new Student("Vijay",2);
		System.out.println(s2.toString());
		System.out.println(s2.hashCode());
		
		
		
	}
}
