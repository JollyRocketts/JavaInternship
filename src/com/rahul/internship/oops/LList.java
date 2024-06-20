package com.rahul.internship.oops;

import java.util.*;
public class LList {
    public static void main(String[] args) {
        LinkedList l = new LinkedList<>();
        l.add("Aryan");
        l.add("Jolly");
        l.add(7);
        System.out.println(("Linked List: "+l));
        System.out.println("Size: "+l.size());
        l.addFirst("Player");
        l.add(1,"Details");
        System.out.println("Updated Linked List: "+l);
        l.remove(1);
        l.removeFirst();
        Iterator it;
        it = l.iterator();
        System.out.print("Linked List elements after removing: ");
        while(it.hasNext()) {
            System.out.print(it.next()+" ");
        }
        System.out.println();
        if(l.isEmpty()) {
            System.out.println("List is Empty.");
        }
        else {
            System.out.println("List is not Empty.");
        }
        byte[] n = {65,114,121,97,110};
        String s = new String(n);
        System.out.println("Name using ASCII: "+s);
    }
}
