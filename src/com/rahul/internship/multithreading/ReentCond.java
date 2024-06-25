package com.rahul.internship.multithreading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentCond extends Thread {
    ReentrantLock r = new ReentrantLock();
    Condition even = r.newCondition();
    Condition odd = r.newCondition();
    int t;
    int MAX_COUNT = 10;

    ReentCond(int t) {
        this.t = t;
    }

    ReentCond() {
        this.t = 0;
    }

    public void run() {
        while (t <= MAX_COUNT) {
            r.lock();
            try {
                if (t % 2 == 1 && Thread.currentThread().getName().equals("even")) {
                    even.await();
                } else if (t % 2 == 0 && Thread.currentThread().getName().equals("odd")) {
                    odd.await();
                } else {
                    System.out.println(Thread.currentThread().getName() + " Thread " + t);
                    t += 1;
                    if (t % 2 == 0) {
                        even.signal();
                    } else if (t % 2 == 1) {
                        odd.signal();
                    }
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            } finally {
                r.unlock();
            }
        }
    }

    public static void main(String[] args) {
        ReentCond rc = new ReentCond(2);
        Thread even = new Thread(rc, "even");
        Thread odd = new Thread(rc, "odd");
        even.start();
        odd.start();
    }
}
