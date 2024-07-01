package com.rahul.internship.collections;

import com.sun.source.tree.Tree;

import java.util.*;

public class MapClass {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1,"Aryan");
        hm.put(2,"Jolly");
        hm.put(3,"Rocketts");

        System.out.println("Value for Key = 1: "+hm.get(1));

        System.out.println("\nAll entries: ");
        for(Map.Entry<Integer, String> me: hm.entrySet()) {
            System.out.println(me.getKey()+" : "+me.getValue());
        }

        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
        tm.put(4,"Map");
        tm.put(2,"to");
        tm.put(1,"Welcome");
        tm.put(3,"the");

        System.out.println("\nEntries in the tree map: ");
        for(Map.Entry<Integer, String> me: tm.entrySet()) {
            System.out.println(me.getKey()+" : "+me.getValue());
        }
    }
}
