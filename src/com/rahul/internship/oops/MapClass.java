package com.rahul.internship.oops;

import java.util.*;

public class MapClass {
    public static void main(String[] args) {
        Map<String, Integer> hm = new LinkedHashMap<String, Integer>();
        hm.put("A", 65);
        hm.put("r", 114);
        hm.put("y", 121);
        hm.put("a", 97);
        hm.put("n", 110);

        System.out.println("Using LinkedHashMap: ");
        for(Map.Entry<String, Integer> me: hm.entrySet()) {
            System.out.print(me.getKey()+":"+me.getValue()+"\n");
        }

        Map<String, Integer> t = new TreeMap<String, Integer>();
        t.put("Hello",4);
        t.put("World",1);
        t.put("Aryan",7);
        t.put("Here",9);

        System.out.println("\nUsing TreeMap: ");
        for(Map.Entry<String, Integer> me: t.entrySet()) {
            System.out.print(me.getKey()+":"+me.getValue()+"\n");
        }

        Map<Integer, Integer> h = new HashMap<Integer, Integer>();

        int[] a = {3,9,3,5,8,2,0,4,2,7,8,1,9,3,4,1,2,3};
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i:a) {
            al.add(i);
        }

        System.out.println("\nArrayList: "+al);

        for(int i:al) {
            h.putIfAbsent(i,Collections.frequency(al,i));
        }
        System.out.println("HashMap with Frequencies: "+h);
    }
}
