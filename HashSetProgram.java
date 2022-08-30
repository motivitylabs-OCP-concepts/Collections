package com.railstation;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetProgram {
	public static void main(String[] args) {
		HashSet<String> h=new HashSet<>();
		h.add("josna");
		h.add("pravali");
		h.add("prathyusha");
		h.add("ramya");
		h.add("pravali");
		h.add("jose");
		h.add("nithish");
		System.out.println(h.containsAll(h));
		System.out.println(h.clone());
		System.out.println(h.contains("jose"));
		System.out.println(h.isEmpty());
		System.out.println(h.removeAll(h));
		System.out.println(h.size());
		System.out.println(h.equals("josna"));
		System.out.println(h.isEmpty());
		System.out.println(h.iterator());
		System.out.println(h.add("josna"));

	 TreeSet<Integer> n=new TreeSet<>();
	 n.add(1);
	 n.add(12);
	 n.add(13);
	 n.add(14);
	 n.add(15);
	 n.add(16);
	 System.out.println(n.contains(2));
	 System.out.println(n);
	 System.out.println(n.addAll(n));
	 System.out.println(n.isEmpty());
	 System.out.println(n.remove(1));
	 System.out.println(n.ceiling(4));
	 System.out.println(n.size());
	 System.out.println(n.descendingIterator());
	 System.out.println(n.spliterator());
	 System.out.println(n.floor(3));
	 
	 LinkedHashSet<Float> a=new LinkedHashSet<>();
	 a.add(5.8f);
	 a.add(21.3f);
	 a.add(2.2f);
	 a.add(99.9f);
	 a.add(78.5f);
	 System.out.println(a.contains(5.5f));
	 System.out.println(a.isEmpty());
     System.out.println(a.size());
     System.out.println(a.clone());
   
}
}
