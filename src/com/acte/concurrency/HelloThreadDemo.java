package com.acte.concurrency;

public class HelloThreadDemo extends Thread {

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String args[]) {
        (new HelloThreadDemo()).start();
    }

}
