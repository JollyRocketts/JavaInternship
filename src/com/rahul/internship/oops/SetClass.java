package com.rahul.internship.oops;

import java.util.*;

enum Names {Aryan, Gautam, Akshit, Amit, Rahul}
public class SetClass {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
        s.add("She");
        s.add("sells");
        s.add("sea");
        s.add("shells");
        s.add("on");
        s.add("the");
        s.add("sea");
        s.add("shore");
        System.out.println("Using HashSet: "+s);

        Set<Names> e;
        e = EnumSet.of(Names.Aryan, Names.Akshit, Names.Amit);
        System.out.println("\nUsing EnumSet: "+e);

        Set<String> h = new LinkedHashSet<String>();
        h.add("She");
        h.add("sells");
        h.add("sea");
        h.add("shells");
        h.add("on");
        h.add("the");
        h.add("sea");
        h.add("shore");
        System.out.println("\nUsing LinkedHashSet:"+h);

        Set<String> t = new TreeSet<String>();
        t.add("She");
        t.add("sells");
        t.add("sea");
        t.add("shells");
        t.add("on");
        t.add("the");
        t.add("sea");
        t.add("shore");
        System.out.println("\nUsing TreeSet:"+t);

    }
}
