package com.zoho.zohograduatestudies.assignment2.part1;

import java.util.*;
public class Qn1
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);

        System.out.print("enter the number 1 : ");
        int num1=scan.nextInt();

        System.out.print("enter the number 2 : ");
        int num2=scan.nextInt();

        System.out.print("enter the number 3: ");
        int num3=scan.nextInt();

        if(num1>num2 && num1 > num3)
        {

            System.out.print("maximum  of three numbers is : "+num1);

        }

        if(num2>num1 && num2 > num3)
        {

            System.out.print("maximum  of three numbers is : "+num2);

        }

        if(num3>num1 && num2 < num3)
        {
            System.out.print("maximum  of three numbers is : "+num3);

        }

    }
}
