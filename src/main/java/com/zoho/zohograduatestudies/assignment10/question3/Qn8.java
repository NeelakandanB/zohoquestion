package com.zoho.zohograduatestudies.assignment10.question3;

import java.util.*;
public class Qn8
{
    public static void main(String args[]) {
        HashSet<Integer> set = new HashSet<>();

        set.add(3);
        set.add(2);
        set.add(1);

        TreeSet<Integer>treeSet=new TreeSet<>(set);

        for (int val : treeSet) {
            System.out.println(val);
        }
    }
}
