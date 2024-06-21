package com.rahul.internship.multithreading;

class Thread1 extends Thread {
    public void run() {
        try {
            System.out.println("Thread 1 running...");
            sleep(2000);
            System.out.println("Thread 1 finished...");
        }
        catch(Exception ex) {
            System.out.println("Exception caught: "+ex);
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        try {
            System.out.println("Thread 2 running...");
            wait();
            System.out.println("Thread 2 finished...");
        }
        catch(Exception ex) {
            System.out.println("Exception caught: "+ex);
        }
    }
}

public class Procs {
}
