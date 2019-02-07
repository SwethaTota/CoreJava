package com.Java;

import java.util.Hashtable;

public class HashTableConcept {

	//HashTable--part of collections --we use Dynamic array
	
	public static void main(String[] args) {
		Hashtable h = new Hashtable(); //creating obj for Hashtable class and importing from Java util.
		
		//stores the value on the basis of Key-value
		h.put("A", "Hello");//put is a method
		h.put("B", "Friends");
		h.put("C", "USA");
		
		System.out.println(h.size());
		System.out.println(h.get("C"));
		h.put(1, 100);
		h.put(2, 200);
		System.out.println(h.size());
		System.out.println(h.get(2));
		
		/// to restrict to specific data type create another object as below
		
		Hashtable<Integer, Integer> h1 = new Hashtable<Integer, Integer>();
		h1.put(3, 300);
		//h1.put("D", 400);//Unresolved compilation problem//key and value should be Int
		
		Hashtable<Integer, String> h2 = new Hashtable<Integer, String>();
		h2.put(4, "India");
		System.out.println(h2.get(4));

	}

}
