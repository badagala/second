package com.te.overriding;

public class Main {

	public static void main(String[] args) {
		
		Parent p=new Parent();
		p.car();
		p.company();
		
		Son s =new Son();
		s.car();
		s.company();
		
		Daughter d=new Daughter();
		d.car();
		d.company();
		

	}

}
