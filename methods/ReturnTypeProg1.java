package com.te.methods;

public class ReturnTypeProg1 {
	
	public static float areaOfTra(int height,int breadth) {
		
		float b=0.5f*height*breadth;
		
		return b;
	}
	public static float areaOfCircle(int radius) {
		float c=11.5f*radius;
		return c;
	}
	public static int areaOfRectangle(int length,int height) {
		int d=11*length*height;
		return d;
	}
	public static double areaOfSquare(int height,int radius) {
		double e=10*height*radius;
		return e;
	}

	public static void main(String[] args) {
		
		System.out.println("Area of Traingle is :"+areaOfTra(5,10));
		System.out.println("Area of Circle is :"+areaOfCircle(5));
		System.out.println("Area of Rectangle is :"+areaOfRectangle(5,10));
		System.out.println("Area of Square is :"+areaOfSquare(5,10));
		

	}

}
