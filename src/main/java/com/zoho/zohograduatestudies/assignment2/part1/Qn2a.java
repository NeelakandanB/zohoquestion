package com.zoho.zohograduatestudies.assignment2.part1;

public class Qn2a
{
    public static void main(String args[])
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(j==i || j==(n-i+1))
                {
                    System.out.print("1");
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
