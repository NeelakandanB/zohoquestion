package com.zoho.zohograduatestudies.assignment10.question3;

import java.util.HashSet;
import java.util.Iterator;

public class Qn1 {
    public static void main(String args[]) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);

        Iterator name = set.iterator();
        while (name.hasNext()) {
            System.out.println(name.next());
        }

    }
}
