package com.rahul.internship.multithreading;

import static java.lang.Thread.*;

class ThreadDetail extends Thread {
    public void run() {
        try {
            System.out.println("Name of Thread: "+Thread.currentThread().getName());
        }
        catch(Exception ex) {
            System.out.println("Exception Caught: "+ex);
        }
    }
}

public class Naming {
    public static void main(String[] args) throws InterruptedException {
        Thread[] tarr = new Thread[activeCount()];
        ThreadDetail t1 = new ThreadDetail();
        ThreadDetail t2 = new ThreadDetail();
        t1.setName("Aryan");
        t2.setName("Jolly");
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        enumerate(tarr);
        for (Thread t : tarr) {
            System.out.println(t.getName());
        }
    }
}
