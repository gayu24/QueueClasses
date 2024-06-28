package com.queueClasses;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
public class ConcurrentLinkedQueueEx {
	public static void main(String[] args) {
		ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();

		// Adding elements to the queue
		queue.add("First element");
		queue.add("Second element");
		queue.add("Third element");
		queue.add("Fourth element");
		queue.add("Fifth element");

		// Removing elements from the queue
		String element1 = queue.poll(); // Removes and returns the head of the queue
		String element2 = queue.peek(); // Retrieves but does not remove the head of the queue

		System.out.println("Removed element: " + element1);
		System.out.println("Peeked element: " + element2);
		System.out.println("Size: "+queue);
	  }
	}


