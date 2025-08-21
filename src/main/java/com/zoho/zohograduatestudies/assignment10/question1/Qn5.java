package com.zoho.zohograduatestudies.assignment10.question1;

//. to update specific array element by given element.

import java.util.ArrayList;
import java.util.List;

public class Qn5 {
    public static void main(String args[]) {

        List<String> colours = new ArrayList<>();
        colours.add("red");
        colours.add("greeen");
        colours.add("yellow");
        System.out.println("before update " + colours);

        colours.set(1, "orange");
        System.out.println("After update : " + colours);
    }
}
