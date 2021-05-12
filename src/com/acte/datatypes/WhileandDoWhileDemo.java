package com.acte.datatypes;

public class WhileandDoWhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int i_count=0;
		while (i_count<5) {
			 i_count=++i_count;
			// i_count=i_count+1;
			 // % / *
		     System.out.println(i_count);
		}
		
		 System.out.println("-----------------");
		do {
			 i_count=--i_count;
			 System.out.println(i_count);
		} while (i_count>1);
		
	}

}
