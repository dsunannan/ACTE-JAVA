package com.acte.generics;

import java.util.*;
class MyObjectType<T> {
	LinkedList<T> lobj = new LinkedList<T>();
	

	void addString(T obj) {
		this.lobj.add(obj);
	}
	
	void removeString(T obj) {
		this.lobj.remove(obj);
	}

	LinkedList<T> getString() {
		return lobj;
	}
	
	void printStringArray(MyObjectType<T> lobj) {
		
		Iterator<T> itr= lobj.getString().iterator();
		System.out.println("PrintArray Start ****");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("PrintArray End ****");
	}
}
