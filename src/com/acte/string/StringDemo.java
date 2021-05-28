package com.acte.string;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s1="Amber"; // String pool 
      String s2= new String("Amber"); // Heap 
      
      String s3= new String("Amber"); // New Heap Space
      
      String s4="Amber"; // String pool s1 & s4 
      String s5="Amber".intern(); // String pool s5 = s1 or s4 
      
      if(s1==s2) {
    	System.out.println("Both are equal");  
      }else {
    	  System.out.println("Both are not equal");  
      }
      
      if(s1.equals(s2)) {
      	System.out.println("Using equals : Both are equal");  
        }else {
      	  System.out.println("Using equals : Both are not equal");  
        }
      
      
      String s8 = s1+s2; // s8 will be alloted new memory 
        s1 = s1+s2; // Amber will be lost and Amber and AmberAmber will exists in Stringpool in new address.
	
	System.out.println("The new String s1"+s1);
	}
	
	
	

}
