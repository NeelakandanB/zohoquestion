package com.zoho.zohograduatestudies.assignment2.part2;


import java.util.Scanner;

public class Qn9 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int marks[][] = new int[10][4];
        int total;
        double average;

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter the student " + (i + 1) + " roll number :  ");
            marks[i][0] = scan.nextInt();

            for (int j = 1; j < marks[i].length; j++) {
                System.out.print("Enter the mark " + j + " : ");
                marks[i][j] = scan.nextInt();
            }
        }
        System.out.printf("%-20s %-20s %-20s%n", "Roll NUmber", "TotalMarks", "Average");
        System.out.println("__________________________________________________");

        for (int i = 0; i < marks.length; i++) {

            total = marks[i][1] + marks[i][2] + marks[i][3];
            average = total / 3;

            System.out.printf("%-20d %-20d %-20.2f%n", marks[i][0], total, average);
        }

    }
}
