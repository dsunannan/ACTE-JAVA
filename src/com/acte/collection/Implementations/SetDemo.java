package com.acte.collection.Implementations;

import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> setStr = new HashSet<String>();
		setStr.add("C");
		setStr.add("C");
		setStr.add("A");		
		setStr.add("B");
		setStr.add("C");
		setStr.add("C");
		System.out.println("HashSet Output:");

		Iterator<String> itr = setStr.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
		Set<String> setLinkedStr = new LinkedHashSet<String>();
		setLinkedStr.add("F");
		setLinkedStr.add("D");
		setLinkedStr.add("E");
		setLinkedStr.add("F");
		System.out.println("LinkedHashSet Output:");
		itr = setLinkedStr.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
		Set<String> setTreeStr = new TreeSet<String>();
		setTreeStr.add("I");
		setTreeStr.add("G");
		setTreeStr.add("H");
		
		System.out.println("TreeSet Output:");

		itr = setTreeStr.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
	}

}
