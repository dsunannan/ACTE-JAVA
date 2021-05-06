package com.acte.exception;

class ArrayIndexOutofBoundsDemo {
	
	public void intialize() throws Throwable {
		
	int a[] = new int[2];// declaration and instantiation  
	a[0] = 10;// initialization  
	a[1] = 20;
	a[-2] = 70;
	a[3] = 40;
	
	}
}


public class RunttimeExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayIndexOutofBoundsDemo arrob = new ArrayIndexOutofBoundsDemo();
		try {
		arrob.intialize();
		}catch (ArrayIndexOutOfBoundsException aiob) {
			System.out.println("1:"+aiob.getMessage());
		}catch (Throwable tObj) {
			System.out.println("2:"+tObj.getMessage());
		}
		
	}

}
