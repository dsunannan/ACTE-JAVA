package com.acte.exception;

public class ErrorExceptionDemo {
	static int temp =1;
	static int factorial (int n) {
		
        if(n==0) {
			return temp;
		} 
		temp = temp * n;
		
		return factorial(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 123;
		
		System.out.println("Factorial of 123 "+factorial(i));
	}

}
