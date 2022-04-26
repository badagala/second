package com.te.methods;//Package is like a folder where we can keep common classes together at one place

//in java, if we are using any class of any package we must have to write import statement
 
import java.util.Scanner;//it is a keyword which indicates that we are using any other class code in our own class

public class AboutScanner {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);//System.in indicates that we are reading input from system.
		System.out.println("Enter your name:");
		String s=scan.nextLine();
		System.out.println("Enter your age:");
		int i=scan.nextInt();
		System.out.println("Enter Percentage:");
		float f=scan.nextFloat();
		System.out.println("Enter Mobileno:");
		long l=scan.nextLong();
		System.out.println("Enter Gender:");
		char c=scan.next().charAt(0);
		
		System.out.println("Here are the student Details are:");
		System.out.println("Here your name is:"+s);
		System.out.println("Here your age is:"+i);
		System.out.println("Here your percentage is:"+f);
		System.out.println("Here your mobileno is:"+l);
		System.out.println("Here your Gender is:"+c);
		
		
		

	}

}
