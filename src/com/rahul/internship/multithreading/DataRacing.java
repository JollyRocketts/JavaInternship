package com.rahul.internship.multithreading;

public class DataRacing extends Thread {
    public static int a;
    public void run() {
        for(int i=0;i<100;i++) {
            a = a+1;
            a = a;
            a = a-1;
        }
    }

    public static void main(String[] args) {
        a = 0;
        for(int i=0;i<1000;i++) {
            new DataRacing().start();
            System.out.println(a);
        }

        //The answer will sometimes become not 0.
        //It became 1 one time. Started with 0 and after a while changed to 1.
    }
}
