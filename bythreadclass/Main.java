package com.te.bythreadclass;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Single sin = new Single();
		sin.start();
		sin.sleep(3000);
		for (int i = 1; i <= 5; i++) {

			System.out.println("After the thread is running");

		}
	}

}
/*
 * • In above program execution starts from main thread and till t1.start()
 * there is only one thread under execution once t1.start() is invoke it creates
 * a thread and calls run() • Now two threads are there for execution main
 * thrread and mythread • So out of two thread which thread to select first for
 * execution is decided by THREAD SCHEDULER. • THREAD SCHEDULER is nothing but
 * JVM and it is upto JVM whichever algorithm it follows and select a thread for
 * execution. • Since we don't know on what basis thread scheduler picks a
 * thread for execution we cannot predict the output of program.
 */