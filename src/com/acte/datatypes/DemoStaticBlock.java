package com.acte.datatypes;

public class DemoStaticBlock {

	/*
	 * static method cannot be overloaded
	 * static method need to be accessed in static way
	 */
	static void m1() {
		
	}
    static void m2(int i) {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DemoStaticBlock dsb = new DemoStaticBlock();
		DemoStaticBlock.m1();
		DemoStaticBlock.m2(1);
		
	}

}
