package com.acte.generics;

import java.util.Arrays;

class TestGenerics {
	public static void main(String args[]) {
		MyGen<Integer> m = new MyGen<Integer>();
		m.add(2);
		m.add(3);
		m.add(4);
		//m.add("Sun");//Compile time error  
		System.out.println(Arrays.asList(m.get()));

		MyObjectType<String> mobj = new MyObjectType<String>();
		mobj.addString("AAA");
		mobj.addString("BBB");
		mobj.addString("CCC");
		mobj.addString("DDD");
		// mobj.addString(1); //Compile time error
		mobj.printStringArray(mobj);
		
	}
}