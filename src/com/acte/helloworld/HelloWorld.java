package com.acte.helloworld;

/*In Case of class the first and second letter is in CAPS  H..W  in helloworld*/
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello !! Amber, Java is exciting !!");
		
		/** new keyword is used to create object calcualtor in heap*/
		
		Calculator calc= new Calculator();
		
		System.out.println("calcualtor add number called"+calc.addNumber());
		System.out.println("calcualtor multiply number called"+calc.multiplyNumber());
		
		
	}

}

class Calculator {
	/*In Case of methods the second letter is in CAPS N in action word add number*/
	public int addNumber() {
		return 0;
	}
	public int multiplyNumber() {
		return 0;
	}
}
