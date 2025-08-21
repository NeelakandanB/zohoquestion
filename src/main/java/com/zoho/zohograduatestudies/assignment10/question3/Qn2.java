package com.zoho.zohograduatestudies.assignment10.question3;

import java.util.HashSet;

public class Qn2 {
    public static void main(String args[]) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);

        for(int val : set)
        {
            System.out.println(val);
        }
    }
}
