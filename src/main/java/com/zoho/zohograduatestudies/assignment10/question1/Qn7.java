package com.zoho.zohograduatestudies.assignment10.question1;
//g. to search an element in an array list.

import java.util.ArrayList;
import java.util.List;

public class Qn7 {
    public static void main(String args[]) {

        List<String> colours = new ArrayList<>();
        colours.add("red");
        colours.add("green");
        colours.add("yellow");
        colours.add("blue");

        System.out.println(colours.contains("yellow"));
    }
}
