package com.rahul.internship.collections;

import java.util.*;

public class StackClass {

    public static void PrintEle(Stack<String> st) {
        if(st.empty()) {
            return;
        }

        String top = st.peek();
        System.out.println(top);
        st.pop();
        PrintEle(st);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<String> st = new Stack<String>();
        st.push("Bottom");
        st.push("Mid");
        st.push("Top");

        System.out.println(st);
        System.out.println();

        Iterator<String> it = st.iterator();

        while(it.hasNext()) {
            System.out.print(it.next()+" ");
        }
        System.out.println();
        System.out.println();

        PrintEle(st);

        System.out.println();
        System.out.println(st);
        System.out.println();

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Aryan");
        lhs.add("Jolly");
        lhs.add("Rocketts");

        Iterator<String> itr = lhs.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println();
        ArrayList<String> al = new ArrayList<String>();
        Collections.addAll(al, "Hello","World","Aryan","Here");

        for(String s: al) {
            if (lhs.contains(s)) {
                System.out.println(s+" is Present");
            } else {
                System.out.println(s+" is Not Present");
            }
        }

        System.out.println("\nThe index of Hello is: "+Collections.binarySearch(al, "Hello"));
        System.out.println("The index of Jolly is: "+Collections.binarySearch(al, "Jolly"));

    }
}
