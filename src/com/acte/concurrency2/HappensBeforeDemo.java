package com.acte.concurrency2;

import com.acte.concurrency.HelloRunnableDemo;

class CounterD implements Runnable {
    public static int c;

    public void increment() {
        c++;
    }

    public void decrement() {
        c--;
    }

    public int value() {
        return c;
    }
    
    public void run() {
		System.out.println("Hello from a Counter !!");
		increment();
		System.out.println("Counter value ::"+value());
		
	}

}

public class HappensBeforeDemo implements Runnable {

	public void run() {
		System.out.println("Hello from a Runnable !!");
		
	}

	public static void main(String args[]) throws InterruptedException {
		(new Thread(new HelloRunnableDemo())).start();
		Thread t1 =new Thread(new CounterD());
		Thread t2=new Thread(new CounterD());
		
		/**
		 * BY using start and join we can establish happens before relation 
		 * and solve memory inconsistency issue
		 */
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		
	}

}
