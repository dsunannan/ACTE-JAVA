package com.acte.accessspecifier.anotherpackage;


import com.acte.accesspecifiers.AccessSpecifiersVariables;

public class AccessSepcifierDemo2 extends AccessSpecifiersVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessSepcifierDemo2 accesObj = new AccessSepcifierDemo2();
		//	System.out.println(accesObj.i);  Not visible, since i is private
			System.out.println(accesObj.j);  // Public is visible
			System.out.println(accesObj.k);  // Protected is visible
			//	System.out.println(accesObj.m); Default not visible
			
			
	}
	
	
	
}
