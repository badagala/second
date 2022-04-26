package com.te.lifecycleofthread;



public class MyThread{

	
	
	

}

/*
 * Life Cycle Of Thread Depending on different phases a Thread will be in any of
 * one phase: 1.New 2.Runnable/Ready 3.Running 4.Blocked 5.Terminated New:- When
 * we create object of our thread class MyThread m1=new Mythread(); Ready:- When
 * we call run() by using start(),but before thread schedule picks that thread
 * for execution m1.start(); Running:- When thread scheduler(CPU) picks thread
 * for execution(run() execution started) Blocked:- If the running thread goes
 * to sleeping state. Terminated or dead:- When execution of run() is completed.
 * 
 */