package com.te.methods;

public class LocalVsGlobal {
	static String name="loki";
	static int id=1;
	static String area="yarragadda";
	static String surname="yarri";
	
	public static void fly() {
		
		System.out.println("From Global level");
		System.out.println(name);
		System.out.println(id);
		System.out.println(area);
		System.out.println(surname);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("From main method");
		System.out.println(name);
		System.out.println(id);
		System.out.println(area);
		System.out.println(surname);
		
		fly();
		
	
	}

}
