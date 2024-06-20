package com.rahul.internship.oops;

class Temp {
    int a;
    Temp(int i) {
        a = i;
    }
    Temp incr() {
        return new Temp(a + 10);
    }
}
public class Test {
    public static void main(String[] args) {
        Temp t1 = new Temp(5);
        Temp t2;
        t2 = t1.incr();
        System.out.println("t1.a: "+t1.a);
        System.out.println("t2.a: "+t2.a);
        t2 = t2.incr();
        System.out.println("New t2.a: "+t2.a);
    }
}
