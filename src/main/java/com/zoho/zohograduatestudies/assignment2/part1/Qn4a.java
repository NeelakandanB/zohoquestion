package com.zoho.zohograduatestudies.assignment2.part1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Qn4a {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int n = scan.nextInt();

        List<Integer> one = new ArrayList<>();
        one.add(1);

        List<Integer> two = new ArrayList<>();
        two.add(1);
        two.add(1);

        List<List<Integer>> result = new ArrayList<>();
        result.add(one);
        result.add(two);

        int value;

        for (int i = 2; i < n; i++) {

            List<Integer> new1 = new ArrayList<>();
            List<Integer> old = result.get(i - 1);
            new1.add(1);

            for (int j = 1; j < old.size(); j++) {

                value = old.get(j) + old.get(j - 1);
                new1.add(value);
            }

            new1.add(1);
            result.add(new1);
        }
        int k;
        for (int i = 0; i < n; i++) {
            k = 0;
            for (int j = 0; j < n; j++) {

                if (i + j >= (n - 1)) {
                    System.out.print(result.get(i).get(k++) + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
