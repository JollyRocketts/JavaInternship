package com.rahul.internship.multithreading;

import java.util.*;

class NameStorer {
    String s = "";
    public static int c;

    public void name(String st, List<String> l) {
        synchronized (this) {
            s = st;
            c++;
        }
        l.add(s);
    }
}

public class BlockSynch {
    public static void main(String[] args) {
        NameStorer ns = new NameStorer();
        List<String> l = new ArrayList<String>();
        ns.name("Aryan",l);
        NameStorer ns2 = new NameStorer();
        ns2.name("Jolly",l);
        NameStorer ns3 = new NameStorer();
        ns3.name("Rocketts",l);
        System.out.println("List: "+l);
        System.out.println("No. of elements: "+ NameStorer.c);
    }
}
