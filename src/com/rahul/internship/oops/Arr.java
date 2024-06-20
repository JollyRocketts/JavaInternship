package com.rahul.internship.oops;

import java.util.Arrays;

public class Arr {
    static int[][] arr = new int[3][];

    public static void main(String[] args) {
        arr[0] = new int[3];
        arr[1] = new int[4];
        arr[2] = new int[5];

        int k = 1;
        for (int[] rows: arr) {
            for (int i=0;i<rows.length;i++) {
                rows[i] = k;
                k += 1;
            }
        }

        System.out.println("2-D Matrix Format Printing:");
        for (int[] subArr : arr) {
            System.out.println(Arrays.toString(subArr));
        }
        System.out.println();
        System.out.println("One-line Printing:\n"+Arrays.deepToString(arr));

        char[] orig = {'a','r','y','a','n','j','o','l','l','y'};
        char[] repl = new char[5];
        System.arraycopy(orig,5, repl, 0, 5);
        System.out.println();
        System.out.println(new String(repl));
    }
}
