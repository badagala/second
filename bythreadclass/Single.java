package com.te.bythreadclass;

public class Single extends Thread{
	
	public void run() {
		
		System.out.println("Thread is running safely");
		
	}

}

/*
 * Multitasking:The process of performing more than one task parallelly is
 * called as Multitasking. It is of 2 types - 1.Process based multitasking
 * 2.Thread based multitasking
 */

/*
 * Process based multitasking: The process of executing more than one task where
 * each task is independent of other.Ex: browsing on google----Task-1 watching
 * something on youtube----Task-2 using excel----Task-3 typing something on
 * word----Task-4
 */

/*
 * Thread based multitasking -------------------------- • The process of
 * executing more than one task parallelly where each task is an independent
 * part of same program such type of processing is called as thread based
 * multitasking or thread programming Ex: If we have a program which contains
 * 100lines of code but what we observed is next 500 is independent of first
 * 500, but still it has to wait until first 500 finishes its execution so due
 * to this, -performance is decreasing -execution time is increasing -CPU
 * utilisation time is decreasing • Therefore, in order to overcome above
 * situations, we will go for Thread programming.
 */

/*
 * Thread ------- • it is a flow of execution (or) • it is a small part of an
 * Application (or) • it is a light weight process • We will create 1-thread for
 * first 500lines • We will create 2-thread for second 500lines and run both the
 * threads parallely
 * 
 * • Programs which contains multiple threads is called as multi threaded
 * program and such process is called as Multithreading.
 */


/*
 * Creation of Thread ------------------- A thread can be created in two ways -
 * 1. By extending Thread class 2. By implementing Runnable Interface Note:
 * ----- In every program always therre is one default thread i.e main
 * thread(main())
 * 
 * Creating Thread by Extending Thread class
 * ------------------------------------------ • Create our class which extends
 * Thread class • For defining thread we have to override run() public void
 * run(); • it is a predefine method of thread class • Using start() we can
 * start execution of thread public synchronized void start(); Note: -----
 * Synchronized is a keyword which indicates that only thread can access method
 * at a time
 */