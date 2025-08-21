package com.zoho.zohograduatestudies.assignment10.question1;

//c. to insert an element into the array list at the first position.

import java.util.List;
import java.util.ArrayList;

public class Qn3 {

    public static void main(String args[]) {
        List<String> colours = new ArrayList<>();
        colours.add("red");
        colours.add("green");
        colours.add("yellow");
        System.out.println(" before inserting  : " + colours);

        colours.add(0, "blue");

        System.out.println("After inserting  : " + colours);
    }
}
