package com.zoho.zohograduatestudies.assignment10.question1;

//h. to sort a given array list.

import java.util.ArrayList;
import java.util.List;

public class Qn8 {

    public static void main(String args[]) {

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(7);

        int min;
        int temp;
        int index = 0;

        for (int i = 0; i < list.size(); i++) {

            min = list.get(i);
            index = i;
            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(j) < min) {

                    min = list.get(j);
                    index = j;
                }
            }
            temp = list.get(i);
            list.set(i, min);
            list.set(index, temp);
        }
        System.out.println(list);
    }
}
