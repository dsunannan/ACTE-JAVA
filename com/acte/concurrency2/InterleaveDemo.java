package com.acte.concurrency2;


class CounterInterleave {
    public static int c = 0;

    public void increment() {
        c++;
    }

    public void decrement() {
        c--;
    }

    public int value() {
        return c;
    }

}

class CounterIncrementor implements Runnable {
	CounterInterleave ci;
	public  CounterIncrementor(CounterInterleave ci) {
		this.ci= ci;
	}
	public void run() {
		
		ci.increment();
		
	}
}
class CounterDecrementor implements Runnable {
	CounterInterleave di;
	public  CounterDecrementor(CounterInterleave di) {
		this.di=di;
	}
	public void run() {
		
		di.decrement();
		
	}
}
public class InterleaveDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CounterInterleave cntIl = new CounterInterleave();
		Thread t1 = new Thread(new CounterIncrementor(cntIl));;
		Thread t2 = new Thread(new CounterDecrementor(cntIl));;
		System.out.println("Counter value before inc/decr - "+cntIl.c);
		t1.start();
		t1.sleep(1000);
		System.out.println("Counter value before inc/decr after 1st thread- "+cntIl.c);
		t2.start();
		System.out.println("Counter value before inc/decr after 2nd thread- "+cntIl.c);
       
	}

}
