package com.rahul.internship.multithreading;

import static java.lang.Thread.sleep;

class Mthread implements Runnable {
    public void run() {
        try {
            System.out.println("Thread "+Thread.currentThread().threadId()+" is running.");
        }
        catch(Exception ex) {
            System.out.println("Caught Exception: "+ex);
        }
    }
}

class Mthread2 extends Thread {
    public void run() {
        try {
            System.out.println("Thread "+Thread.currentThread().threadId()+" is running.");
        }
        catch(Exception ex) {
            System.out.println("Caught Exception: "+ex);
        }
    }
}

public class Multithread {
    public static void main(String[] args) throws InterruptedException {
        int n = 5;
        for(int i=0;i<n;i++) {
            Thread t = new Thread(new Mthread());
            t.start();
            t.join();
        }
        System.out.println("------------------");
        for(int i=0;i<n;i++) {
            Mthread2 t2 = new Mthread2();
            t2.start();
        }
    }
}
