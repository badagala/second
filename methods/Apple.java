package com.te.methods;

public class Apple {
	
	String name;
	int price;
	String apple;
	int idno;
	
	public Apple(String sname,int sprice,String sapple,int sidno) {
		name=sname;
		price=sprice;
		apple=sapple;
		idno=sidno;		
		
	}

	public static void main(String[] args) {
		
		Apple ap=new Apple("ravi",500,"greenapple",1);
		System.out.println(ap.name+" "+ap.price+" "+ap.idno+" "+ap.apple);
		
		
		Apple ap1=new Apple("teja",300,"yellowapple",2);
		System.out.println(ap1.name+" "+ap1.price+" "+ap1.idno+" "+ap1.apple);
		
		

	}

}
