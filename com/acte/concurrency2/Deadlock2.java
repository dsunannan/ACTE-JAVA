package com.acte.concurrency2;

import java.util.concurrent.locks.ReentrantLock;

public class Deadlock2 {
    static class Friend {
    	private final ReentrantLock lock = new ReentrantLock();
        private final String name;
        public Friend(String name) {
            this.name = name;
        }
        public String getName() {
            return this.name;
        }
        public  void bow(Friend bower) {
           
            lock.lock();  // block until condition holds
            try {
              // ... method body
            	 System.out.format("%s: %s"
                         + "  has bowed to me!%n", 
                         this.name, bower.getName());
                     bower.bowBack(this);
            } finally {
              lock.unlock();             
            }
        }
        public  void bowBack(Friend bower) {
        	
            System.out.format("%s: %s"
                + " has bowed back to me!%n",
                this.name, bower.getName());
        }
    }

    public static void main(String[] args) {
        final Friend alphonse =
            new Friend("Amber");
        final Friend gaston =
            new Friend("Chockalingam");
        new Thread(new Runnable() {
            public void run() { alphonse.bow(gaston); }
        }).start();
        new Thread(new Runnable() {
            public void run() { gaston.bow(alphonse); }
        }).start();
    }
}