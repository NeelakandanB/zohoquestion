package com.zoho.zohograduatestudies.assignment10.question1;

//to retrieve an element (at a specified index) from a given array list.

import java.util.ArrayList;
import java.util.List;

public class Qn4 {

    public static void main(String args[]) {
        List<String> colours = new ArrayList<>();
        colours.add("red");
        colours.add("green");
        colours.add("yellow");

        System.out.println(colours.contains("yellow"));
    }
}
