package com.zoho.zohograduatestudies.assignment10.question1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Qn2 {
    public static void main(String args[]) {
        List<String> colours = new ArrayList<>();
        colours.add("red");
        colours.add("green");
        colours.add("yellow");

        Iterator itr = colours.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
