package com.rahul.internship.oops;

class Point {
    int x;
    int y;
    Point() {
        int x = 0;
        int y = 0;
    }
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Circle extends Point {
    int r;
    Circle() {
        super();
        r = 0;
    }
    Circle(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }
    boolean pointOnCircle(int x, int y) {
        return (int) Math.pow((this.x - x), 2) + (int) Math.pow((this.y - y), 2) == (int) Math.pow(r, 2);
    }
}

public class Trial {
    public static void main(String[] args) {
        float dist;
        Point p1 = new Point(4,3);
        Point p2 = new Point(10,15);
        System.out.println("x1: "+p1.x);
        System.out.println("y1: "+p1.y);
        System.out.println("x2: "+p2.x);
        System.out.println("y2: "+p2.y);
        int dx = p1.x - p2.x;
        int dy = p1.y - p2.y;
        dist = (float) Math.sqrt(dx*dx + dy*dy);
        System.out.println("Distance between p1 and p2: "+dist);
        Circle c = new Circle(0, 0, 5);
        System.out.println("Circle Details:\nCentre: ("+c.x+","+c.y+")\nRadius: "+c.r);
        if (c.pointOnCircle(p1.x, p1.y)) {
            System.out.println("Point p1 is on the Circle.");
        }
        else {
            System.out.println("Point p1 is not on the Circle.");
        }
    }
}
