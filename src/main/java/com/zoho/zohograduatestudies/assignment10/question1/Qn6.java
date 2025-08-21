package com.zoho.zohograduatestudies.assignment10.question1;

//f. to remove the third element from an array list.

import java.util.ArrayList;
import java.util.List;

public class Qn6 {
    public static void main(String args[]) {

        List<String> colours = new ArrayList<>();
        colours.add("red");
        colours.add("greeen");
        colours.add("yellow");
        colours.add("blue");
        System.out.println("before update " + colours);

        colours.remove(3);
        System.out.println("after update : " + colours);
    }
}
