package com.zoho.zohograduatestudies.assignment2.part1;

public class Qn2b
{
    public static void main(String args[])
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-1;j++)
            {
                if( i<=3 && (i==1 || j==1 || i==3 || j==n-1) )
                {
                    System.out.print("R ");
                }

                else if( i>3 && (j==i-1|| j==1))
                {
                    System.out.print("R");
                }

                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
