package com.rahul.internship.collections;

import java.util.*;

public class CollMethods {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        Collections.addAll(nums, 1,6,2,7,9,5,2,6,8,3,1,2,1,3,7,3,6,9,5);
        ArrayList<Integer> nums2 = new ArrayList<Integer>();
        Collections.addAll(nums2, 5,2,6,8,3,1,6,3,4,6,8,3,5,3,7,8,2,3,5);

        System.out.println("Nums elements: "+nums);
        System.out.println("\nNums2 before copying: "+nums2);

        Collections.copy(nums2, nums);

        System.out.println("Nums2 after copying: "+nums2);

        System.out.println("\nNums before sorting: "+nums);
        System.out.println("Nums2 before sorting: "+nums2);

        Collections.sort(nums);

        System.out.println("\nNums after sorting: "+nums);
        System.out.println("Nums2 after sorting nums: "+nums2);

        System.out.println("\nThis means it's a deep copy, not a shallow copy.");

        Collections.rotate(nums2, -3);
        System.out.println("Nums2 after rotating right thrice: "+nums2);

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        System.out.println("\nFrequency of all elements: ");

        for(Integer i: nums) {
            if(!hm.containsKey(i)) {
                System.out.println(i+" : "+Collections.frequency(nums, i));
                hm.put(i, Collections.frequency(nums, i));
            }
        }

        System.out.println("\nElements and Freq.: "+hm);
    }
}
