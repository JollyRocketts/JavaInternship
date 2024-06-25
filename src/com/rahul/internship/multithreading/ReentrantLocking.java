package com.rahul.internship.multithreading;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

class helper implements Runnable {
    String name;
    ReentrantLock r;

    public helper(ReentrantLock r, String n) {
        this.r = r;
        name = n;
    }

    public void run() {
        boolean f = false;
        while(!f) {
            boolean res = r.tryLock();

            if(res) {
                try {
                    Date d = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("Task: "+name+" Outer Lock acquired at "+sdf.format(d)+" Doing Outer Work");
                    Thread.sleep(1500);
                    r.lock();

                    try {
                        d = new Date();
                        sdf = new SimpleDateFormat("hhs:mm:ss");
                        System.out.println("Task: "+name+" Inner Lock acquired at "+sdf.format(d)+" Doing Inner Work");
                        System.out.println("Lock Hold Count: "+r.getHoldCount());
                        Thread.sleep(1500);
                    }
                    catch(InterruptedException ex) {
                        ex.printStackTrace();
                    }
                    finally {
                        System.out.println("Task: "+name+" Releasing Inner Lock");
                        r.unlock();
                    }
                    System.out.println("Lock Hold Count: "+r.getHoldCount());
                    System.out.println("Task: "+name+" Work done");
                    f = true;
                }
                catch(InterruptedException ex) {
                    ex.printStackTrace();
                }
                finally {
                    System.out.println("Task: "+name+" Releasing Outer Lock");
                    r.unlock();
                    System.out.println("Lock Hold Count: "+r.getHoldCount());
                }
            }
            else {
                System.out.println("Task: "+name+" Waiting for Lock");

                try {
                    Thread.sleep(1000);
                }
                catch(InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}

public class ReentrantLocking {
    public static void main(String[] args) {
        ReentrantLock r = new ReentrantLock();
        ExecutorService pool = Executors.newFixedThreadPool(2);

        Runnable h1 = new helper(r, "Job1");
        Runnable h2 = new helper(r, "Job2");
        Runnable h3 = new helper(r, "Job3");
        Runnable h4 = new helper(r, "Job4");

        pool.execute(h1);
        pool.execute(h2);
        pool.execute(h3);
        pool.execute(h4);
        pool.shutdown();

    }
}
