package com.te.equals;

public class Teacher {

	public static void main(String[] args) {
		Teacher t1=new Teacher();
		Teacher t2=new Teacher();
		Teacher t3=t1;
		Teacher t4=t2;
		
		System.out.println(t1+" "+t2+" "+t3+" "+t4);
		System.out.println(t1.equals(t2));
        System.out.println(t2.equals(t3));
        System.out.println(t1.equals(t3));
        System.out.println(t4.equals(t2));
	}

}
