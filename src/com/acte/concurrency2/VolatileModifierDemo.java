package com.acte.concurrency2;


class CounterVolatile  implements Runnable {
    public static volatile int c = 0;

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
		System.out.println("Hello from a CounterVolatile !!");
		increment();
		System.out.println( Thread.currentThread().getName()+" - Counter value ::"+value());
		
	}
}
public class VolatileModifierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 =new Thread(new CounterVolatile());
		Thread t2=new Thread(new CounterVolatile());
		
		t1.start();
		
		t2.start();

	}

}
