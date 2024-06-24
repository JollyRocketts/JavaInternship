package com.rahul.internship.multithreading;

public class DeadlockMainT {
    public static void main(String[] args) {
        try {
            System.out.println("Deadlock initializing...");
            Thread.currentThread().join();
            System.out.println("Hello");
        }
        catch(InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
