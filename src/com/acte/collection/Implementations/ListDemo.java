package com.acte.collection.Implementations;

import java.util.*;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ArrayList Intialization 
		 */
		List<String> listStr = new ArrayList<String>();
		listStr.add("A");
		listStr.add("B");
		listStr.add("C");
		listStr.add("D");

		Iterator<String> itr = listStr.iterator();
		System.out.println("ArrayList Output:");
		//hasNext to check if element there in the list 
		// next is to get the element out of the Iterator Array.
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		/*
		 * LinkedList Intialization 
		 */
		List<String> linkedlistStr = new LinkedList<String>();
		linkedlistStr.add("E");
		linkedlistStr.add("F");
		linkedlistStr.add("G");
		linkedlistStr.add("H");
		
		

		Iterator<String> itr2 = linkedlistStr.iterator();
		System.out.println("LinkedList Output:");
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}

}
