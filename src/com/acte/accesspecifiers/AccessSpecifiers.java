package com.acte.accesspecifiers;

 class AccessSpecifiersDemo{
	
	/*
	 * private,protected and public
	 * If you don't specify any access specifiers then default
	 */
	private int i; //most restrictive
	protected int j;// somewhat restrivtive class + extended class 
	public int k; // Fully acceesible
	 int  m; 
	
	 public void m1() {
		 
	 }
	 private void m2() {
		 
	 }
	 
	 protected void m3() {
		 
	 }
	 
	 void m4() {
		 
	 }
	
}

public class AccessSpecifiers extends AccessSpecifiersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessSpecifiers accesObj = new AccessSpecifiers();
	//	System.out.println(accesObj.i); Not visible, since i is private
		System.out.println(accesObj.j);
		System.out.println(accesObj.k);
		System.out.println(accesObj.m);
		
		
      
	}

}
