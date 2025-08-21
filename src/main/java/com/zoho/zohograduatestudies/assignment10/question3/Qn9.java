package com.zoho.zohograduatestudies.assignment10.question3;

import java.util.*;

public class Qn9
{
    public static void main(String args[]) {
        HashSet<Integer> set = new HashSet<>();

        set.add(4);
        set.add(2);
        set.add(3);

        List<Integer>list=new ArrayList<>(set);

        for (int val : list) {
            System.out.println(val);
        }
    }
}
