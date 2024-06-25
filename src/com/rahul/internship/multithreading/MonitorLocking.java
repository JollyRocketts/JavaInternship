package com.rahul.internship.multithreading;

class SharedClass {
    synchronized public void disp(String s) {
        for(int i=0;i<s.length();i++) {
            System.out.print(s.charAt(i));

            try {
                Thread.sleep(100);
            }
            catch(Exception ex) {
                System.out.println("Exception Caught: "+ex);
            }
        }
    }
}

class FirstOne extends Thread {
    SharedClass s;

    public FirstOne(SharedClass s) {
        this.s = s;
    }

    public void run() {
        s.disp("Aryan");
    }
}

class SecondOne extends Thread {
    SharedClass s;

    public SecondOne(SharedClass s) {
        this.s = s;
    }

    public void run() {
        s.disp(" Jolly");
    }
}

public class MonitorLocking {
    public static void main(String[] args) {
        SharedClass s = new SharedClass();

        FirstOne f = new FirstOne(s);
        SecondOne se = new SecondOne(s);

        f.start();
        se.start();
    }
}
