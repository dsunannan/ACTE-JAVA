package com.acte.concurrency2;



class CounterD2 implements Runnable {
    public static int c;

    public synchronized  void increment() {
        c++;
    }

    public synchronized  void decrement() {
        c--;
    }

    public synchronized  int value() {
        return c;
    }
    
    public void run() {
		System.out.println("Hello from a CounterD2 !!");
		increment();
		System.out.println("Counter value ::"+value());
		
	}

}
public class SynchronizedMethodDemo {
	public static void main(String args[]) throws InterruptedException {
		
		Thread t1 =new Thread(new CounterD2());
		Thread t2=new Thread(new CounterD2());
		t1.start();
		//t1.join();
		t2.start();
		//t2.join();
		
	}
}
