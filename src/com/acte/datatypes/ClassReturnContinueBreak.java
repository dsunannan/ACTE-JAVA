package com.acte.datatypes;

class DemoReturn {
	public void method1Demo() {

	}

	public int method1Demo(int i) {
		return 1;
	}
}

public class ClassReturnContinueBreak {
	public static void main(String[] args) {

		int i_count = 0;
		while (i_count < 5) {
			i_count = ++i_count;
			System.out.println(i_count);
			break;

		}

		System.out.println("------------");
		i_count = 0;
		while (i_count < 5) {
			i_count = ++i_count;
			System.out.println(i_count);
			continue;

		}

		DemoReturn dmrt = new DemoReturn();
		
		int i_retrurn= dmrt.method1Demo(1);
		
		System.out.println("i_retrurn :"+i_retrurn);
	}
}
