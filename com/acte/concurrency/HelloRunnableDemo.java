package com.acte.concurrency;

public class HelloRunnableDemo implements Runnable {

	public void run() {
		System.out.println("Hello from a Runnable !!");
	}

	public static void main(String args[]) {
		(new Thread(new HelloRunnableDemo())).start();
	}

}
