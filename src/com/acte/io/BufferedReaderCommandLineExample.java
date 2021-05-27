package com.acte.io;

import java.io.*;  

public class BufferedReaderCommandLineExample {
	public static void main(String args[])throws Exception{             
		InputStreamReader r=new InputStreamReader(System.in);    
		BufferedReader br=new BufferedReader(r);            
		/*
		 * System.out.println("Enter your name"); String name=br.readLine();
		 */   
		System.out.println("Enter your age");   
		int age = br.read();
		System.out.println("Welcome "+"CL" +" your age "+age);    
	}    
}  
