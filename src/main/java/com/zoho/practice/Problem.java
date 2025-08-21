package com.zoho.practice;

import java.util.*;
public class Problem
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=scan.nextInt();

        for(int i=1;i<=(n*2)-1;i++)
        {
            for(int j=1;j<=n;j++)
            {

                if(i>n && (i+j)<=n*2)
                {

                    System.out.print("* ");
                }

                else if(i<=n && j<=i)
                {

                    System.out.print("* ");

                }
            }
            System.out.println();
        }
    }
}
