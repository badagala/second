package com.te.methods;

public class MethodOverLoading1 {
	
	public static void main(String name,int id) {
		System.out.println("Name:"+name);
		System.out.println("id:"+id);
	}
	public static void main(String name,int id,String password ) {
		
		System.out.println("name:"+name);
		System.out.println("id:"+id);
		System.out.println("password:"+password);
	}
	public static void main(String name,int id,String password,String work) {
		
		System.out.println("name:"+name);
		System.out.println("id:"+id);
		System.out.println("password:"+password);
		System.out.println("work:"+work);
	}

	public static void main(String[] args) {
		
		main("Vijay",1);
		main("Lokesh",2,"loki");
		main("swamy",1,"poojari","ford");
		
		
	
		

	}

}
