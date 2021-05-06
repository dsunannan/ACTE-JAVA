package com.acte.string;

public class StringBufferDemo {
	public static void main(String args[]) {
		 StringBuffer sbf = new StringBuffer(); //Heap
		  sbf.append("Chokka");
		  sbf.append("Lingam");
		  	System.out.println(sbf.hashCode());
		  	 sbf.append("Lingam2");
		  	System.out.println(sbf.hashCode());
		  	
		  	System.out.println(sbf);
		  	
		  	 StringBuilder sbd = new StringBuilder(); //Heap
		  	sbd.append("Najib");
		  	sbd.append("Amber");
		  	
		  	System.out.println(sbd);
	}
 
}
