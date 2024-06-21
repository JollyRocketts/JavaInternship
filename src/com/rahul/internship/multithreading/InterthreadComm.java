package com.rahul.internship.multithreading;

class Prob {
    int n;
    boolean flag = false;

    synchronized void put(int n) {
        if(flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Exception caught: " + e);
            }
        }
            this.n = n;
            System.out.println(("Producer : "+n));
            flag = true;
            notify();
    }

    synchronized int get() {
        if(!flag) {
            try {
                wait();
            }
            catch(InterruptedException e) {
                System.out.println("Exception caught: "+e);
            }
        }

        System.out.println("Consumer : "+n);
        flag = false;
        notify();
        return(n);
    }
}

class Producer implements Runnable {
    Prob p;

    Producer(Prob p) {
        this.p = p;
        new Thread(this).start();
    }

    public void run() {
        int i=0;
        while(i<=10) {
            p.put(i++);
        }
    }
}

class Consumer implements Runnable {
    Prob p;

    Consumer(Prob p) {
        this.p = p;
        new Thread(this).start();
    }

    public void run() {
        int i=0;
        while(i<=10) {
            p.get();
            i++;
        }
    }
}
public class InterthreadComm {
    public static void main(String[] args) {
        Prob p = new Prob();
        new Producer(p);
        new Consumer(p);
    }
}
