package com.zoho.zohograduatestudies.assignment10.question3;

import java.util.HashSet;

public class Qn6
{
    public static void main(String args[]) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);

        HashSet<Integer> clone=(HashSet<Integer>)set.clone();

        System.out.println("The set values is "+set);
        System.out.println("The clone values is "+clone);

    }
}
