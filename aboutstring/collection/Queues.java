package com.te.collection;

import java.util.PriorityQueue;

public class Queues {

	public static void main(String[] args) {
		PriorityQueue queue=new PriorityQueue();
		queue.add("Java");
		queue.add("Testing");
		queue.add("Phyton");
		queue.add("Selenium");
		
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.contains(queue));
		while(queue.peek()!=null) {
			System.out.println(queue.poll());
		}
		System.out.println("After the while loop:"+queue.poll());

	}

}
