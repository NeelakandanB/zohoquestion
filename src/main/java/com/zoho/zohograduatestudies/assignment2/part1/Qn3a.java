package com.zoho.zohograduatestudies.assignment2.part1;

import java.util.*;
public class Qn3a
{
    public static void main(String args[])
    {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the final number : ");
    int num=scan.nextInt();
    //System.out.println("Enter the value  : ");
    //int k=scan.nextInt();
    int gap=0;

     		  for(int i=1;i<=num*2-1;i++)
    {
        if(i<=num)
        {
            gap=num-i;
        }

        else
        {
            gap=i-num;
        }

        for(int j=1;j<=num;j++)
        {
            if(j<=gap)
            {
                System.out.print(" ");
            }
            else
            {
                System.out.print("* ");
            }
        }
        System.out.println();
    }

}

}


