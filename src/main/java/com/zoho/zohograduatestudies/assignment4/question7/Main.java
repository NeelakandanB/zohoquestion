package com.zoho.zohograduatestudies.assignment4.question7;

public class Main {

    public static void main(String[] args) {
        BasicCalculator bc = new BasicCalculator();
        System.out.println("Addition : " + bc.add(10, 2));
        System.out.println("Subtraction :" + bc.sub(10, 2));
        System.out.println("Multiplication : " + bc.multiply(10, 2));
        System.out.println("Divide : " + bc.divide(10, 2));
        System.out.println();

        AdvanceCalculator ac = new AdvanceCalculator();
        System.out.println("Power : " + ac.pow(8, 4));
        System.out.println("Modulus : " + ac.mod(10, 2));
        System.out.println("Square Root : " + ac.square(64));
        System.out.println();

        ScientificCalculator sc = new ScientificCalculator();
        System.out.println("Sin : " + sc.sin(1));
        System.out.println("Cos : " + sc.cos(1));
        System.out.println("Log : " + sc.log(1));
        System.out.println("Exponential : " + sc.exp(1));
    }
}
