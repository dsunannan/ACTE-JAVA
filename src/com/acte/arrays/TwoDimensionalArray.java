package com.acte.arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[2][2];// declaration and instantiation  
		
		a[0][0] = 80;// initialization  
		a[0][1] = 90;
		
		
		a[1][0] = 10;// initialization  
		a[1][1] = 20;
		
		
		// traversing array  
		for (int i = 0; i < a.length; i++)// length is the property of array  
		{
			System.out.print("{");
			for (int j = 0; j < a.length;j++) {
				
				//System.out.print("i"+i+"j"+j);
				System.out.print(a[j][i] + " ");
			}
			System.out.print("}");
			System.out.println("");
		}
			
		
	}
	}

// When a variable intialized in array index and if we try to access index outside what is initialized
// you will get ArrayIndexOutOfBounds

