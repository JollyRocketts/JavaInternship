package com.rahul.internship.multithreading;

import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class TestResource {
    private final Lock dispL = new ReentrantLock();
    private final Lock readL = new ReentrantLock();

    public void dispRecord(Object doc) {
        final Lock dispL = this.dispL;
        dispL.lock();

        try {
            long dur = (long) (Math.random()*10000);
            System.out.println(Thread.currentThread().getName()+": TestResource: display a Job during "+(dur/1000)+" sec :: Time - "+new Date());
            Thread.sleep(dur);
        }
        catch(InterruptedException ex) {
            ex.printStackTrace();
        }
        finally {
            System.out.println(Thread.currentThread().getName()+": The document has been displayed.");
            dispL.unlock();
        }
    }
    public void readRecord(Object doc) {
        final Lock readL = this.readL;
        readL.lock();

        try {
            Long dur = (long) (Math.random()*10000);
            System.out.println(Thread.currentThread().getName()+": TestResource: reading a Job during "+(dur/1000)+" sec :: Time - "+new Date());
            Thread.sleep(dur);
        }
        catch(InterruptedException ex) {
            ex.printStackTrace();
        }
        finally {
            System.out.println(Thread.currentThread().getName()+": The document has been read.");
            readL.unlock();
        }
    }

}

class ReadJob implements Runnable {
    private TestResource t;

    ReadJob(TestResource t) {
        this.t = t;
    }

    @Override public void run() {
        System.out.println("Read job");
        t.readRecord(new Object());
    }
}

class DisplayJob implements Runnable {
    private TestResource t;

    DisplayJob(TestResource t) {
        this.t = t;
    }

    @Override public void run() {
        System.out.println("Display job");
        t.dispRecord(new Object());
    }
}

public class LockingReent {
    public static void main(String[] args) {
        TestResource t = new TestResource();
        Thread[] thread = new Thread[10];
        for(int i=0;i<5;i++) {
            thread[i] = new Thread(new DisplayJob(t),"Thread "+i);
        }
        for(int i=5;i<10;i++) {
            thread[i] = new Thread(new ReadJob(t),"Thread "+i);
        }
        for(int i=0;i<10;i++) {
            thread[i].start();
        }
    }
}
