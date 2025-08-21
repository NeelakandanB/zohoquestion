package com.zoho.zohograduatestudies.assignment10.question3;

import java.util.HashSet;

public class Qn7 {
    public static void main(String args[]) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);

        Integer[] arr = new Integer[set.size()];

        set.toArray(arr);

        for (int val : arr) {
            System.out.println(val);
        }
    }
}