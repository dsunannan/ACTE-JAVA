package com.acte.revision;

public class Chockalingam {
	static int i=0;
	
	static void m1() {
		System.out.println("Inside static method m1..");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chockalingam cobj = new Chockalingam();
		System.out.println("Static way to access static variable.."+Chockalingam.i);
		Chockalingam.i=Chockalingam.i+1;
		System.out.println("Static  variable incremented .."+Chockalingam.i);
		Chockalingam.m1();
		System.out.println("Static way to access static variable C2.."+Chockalingam2.i);
		
		Chockalingam2 cobj2 = new Chockalingam2();
		cobj2.increment1(cobj2);
		System.out.println("c1 k value.."+cobj2.k);
		cobj2.increment2(1);
		System.out.println("c1 j value.."+cobj2.j);
	}

}

/**
 * Call by value and call by referrence demo
 * @author sunma
 *
 */

 class Chockalingam2 {
	static int i=0;
	
	int j=1;
	int k=1;
	
	static void m1() {
		System.out.println("Inside static method m1..");
	}
	
	public Chockalingam2 increment1(Chockalingam2 obj) {
		obj.k=obj.k+1;
				
		return obj;
	}
	
	public int increment2(int j) {
		j=j+1;
				
		return j;
	}

	

}