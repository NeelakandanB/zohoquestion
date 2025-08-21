package com.zoho.practice;

import java.util.Scanner;

public class Diamond
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length :");
        int n = scan.nextInt();
        int gap=0;

        for(int i=1;i<=(n*2)-1;i++)
        {
            if(i<=n)
            {
                gap=n-i;
            }
            if(i>n)
            {
                gap=i-n;
            }
            for(int j=1;j<=n;j++)
            {
                if(j>gap)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

}
