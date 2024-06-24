package com.rahul.internship.multithreading;

import java.io.*;

class ThreadJ extends Thread{
    @Override public void run() {
        for(int i=0;i<2;i++) {
            try {
                Thread.sleep(500);
                System.out.println("Current Thread0: "+Thread.currentThread().getName());
            }
            catch(Exception ex) {
                System.out.println("Exception caught: "+ex);
            }
            System.out.println(i);
        }
    }
}

public class ThreadJoin {
    public static void main(String[] args) {
        ThreadJ t1 = new ThreadJ();
        ThreadJ t2 = new ThreadJ();
        ThreadJ t3 = new ThreadJ();

        t1.start();

        try {
            System.out.println("Current Thread1: "+Thread.currentThread().getName());
            t1.join();
            System.out.println("Calling t1.join()");
        }
        catch(Exception ex) {
            System.out.println("Exception caught: "+ex);
        }

        t2.start();

        try {
            System.out.println("Current Thread2: "+Thread.currentThread().getName());
            t2.join();
            System.out.println("Calling t2.join()");
        }
        catch(Exception ex) {
            System.out.println("Exception caught: "+ex);
        }

        t3.start();

        try {
            System.out.println("Current Thread3: "+Thread.currentThread().getName());
            t1.join();
            System.out.println("Calling t3.join()");
        }
        catch(Exception ex) {
            System.out.println("Exception caught: "+ex);
        }
    }
}
