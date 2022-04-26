package com.te.exception;
/*An Exception is an unwanted or unexpected condition which disturbs
our normal flow of execution.
Once Exception occured remaining part of program will not be executed.
• So, it is our responsibility to handle the exception.
• Exception handling doesn't means, we are resolving an exception it
is just like providing an alternate solution so that even though
exception happens our program should work properly.
• Object class is a super class to all the predefine and userdefine
classes of java.
• Throwable class is a super class to "Exception" class and "Error"
class.
• Exception class is a super class to RuntimeException class and other
Exception classes.
• All the Exception classes belongs to java.lang package.*/


public class Scooter {
	
	public static void div() {
		int a=10;
		int b=0;
		int c=a/b;
		
		System.out.println("Exception Occured");
		System.out.println(c);
		
	}

	public static void main(String[] args) {
		div();
		

	}

}


/*
 * In the above program execution begins from main method and it calls to div().
 * In div() there is an unexpected statement i.e c=10/0 when this statement is
 * encountered div() creates an Exception object which includes - Name:
 * description: location: and handover it to JVM, Now JVM will checks if there
 * is any exception handling code present in div() since there is no exception
 * handling code present in div() it checks with caller method in above program
 * i.e, main(). So it checks in main() if there is any exception handling code
 * present or not. Since, there is no exception handling code present in main()
 * also, JVM will calls to default Exception handler i.e
 * printStackTrace()(method) and that default exception handler provides the
 * complete inforamtion of Exception.
 */
