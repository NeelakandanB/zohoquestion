package com.zoho.zohograduatestudies.assignment10.question3;
import java.util.*;

public class Qn10
{
    public static void main(String args[])
    {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(3);
        set1.add(2);
        set1.add(1);
        set2.add(4);

        System.out.println(set1.containsAll(set2));
    }
}
