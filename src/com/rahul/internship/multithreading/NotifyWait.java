package com.rahul.internship.multithreading;

class T extends Thread {
    int tot;
    public void run() {
        synchronized (this) {
            for(int i=0;i<10;i++) {
                tot += i;
            }
            notify();
        }
    }
}

public class NotifyWait {
    public static void main(String[] args) {
        T t = new T();
        t.start();
        synchronized (t) {
            try {
                System.out.println("Waiting for Thread 2 to complete...");
                t.wait();
            }
            catch(InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println("Total: "+t.tot);
        }
    }
}
