package com.rahul.internship.oops;

import java.util.*;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Aryan");
        al.add("Surname");
        al.add("Jolly");
        System.out.println("Original ArrayList: "+al);
        al.addFirst("FirstName");
        al.set(2,"LastName");
        System.out.println("After Adding & Updating: "+al);
        al.removeFirst();
        al.remove(1);
        System.out.println("After Removal: "+al);
        System.out.println("Size of ArrayList: "+al.size());
        al.clear();
        System.out.println("After removing all elements: "+al);
        System.out.println("Size: "+al.size());

        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(1);
        al2.add(2);
        al2.add(3);
        al2.add(5);
        al2.add(4);
        int sum = 0;
        for (int i: al2) {
            sum += i;
        }
        System.out.println("New ArrayList: "+al2);
        System.out.println("Sum of ArrayList: "+sum);
        Comparator<Integer> com = Collections.reverseOrder();
        al2.sort(com);
        System.out.println("ArrayList in Descending: "+al2);
        Comparable[] al3;
    }
}