package com.railstation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackProgram {

	public static void main(String[] args) 
	{
		Stack<Integer> i=new Stack<>(); //last-in-fast-out
			i.add(1);
		    i.add(2);
		    i.add(3);
		    i.add(4);
		System.out.println(i.pop()); //remove the element
		System.out.println(i.push(5)); //add the element on top
		System.out.println(i.peek());  // gives the first element
		System.out.println(i.search(77)); // returns position of object,else -1 print
		System.out.println(i.empty()); // returns true or false based on ele's found
		System.out.println(i.search(1)); // returns position of object
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
          
     /*  Queue<String> q=new LinkedList<>(); //first-in-first-out
       q.add("josna");
       q.add("josu");
       q.add("pravali");
       q.add("sudeepthi");
       q.add("navya");
       q.add("prathyu");
       System.out.println(q.poll());//retrieves and removes the head of the queue
       System.out.println(q.peek());//returns the head of the queue
       System.out.println(q.offer("josna"));//returns true based on element found
       System.out.println(q.remove("navya"));// removes the element of the queue
       System.out.println(q); // gives the elements of the queue */
}
}