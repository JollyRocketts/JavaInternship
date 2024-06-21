package com.rahul.internship.multithreading;

class ClassA extends Thread {
    public void run() {
        System.out.println("Thread A running...");
        for(int i=1;i<=5;i++) {
            System.out.println("Thread A: i = "+i);
        }
        System.out.println("Thread A finished...");
    }
}

class ClassB extends Thread {
    public void run() {
        System.out.println("Thread B running...");
        for(int j=1;j<=5;j++) {
            System.out.println("Thread B: j = "+j);
        }
        System.out.println("Thread B finished...");
    }
}

class ClassC extends Thread {
    public void run() {
        System.out.println("Thread C running...");
        for(int k=1;k<=5;k++) {
            System.out.println("Thread C: k = "+k);
        }
        System.out.println("Thread C finished...");
    }
}

public class Prio {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassB b = new ClassB();
        ClassC c = new ClassC();

        a.setPriority(Thread.MIN_PRIORITY);
        b.setPriority(b.getPriority()+1);
        c.setPriority(Thread.MAX_PRIORITY);

        a.start();
        b.start();
        c.start();

        System.out.println("Program ending...");
    }
}
