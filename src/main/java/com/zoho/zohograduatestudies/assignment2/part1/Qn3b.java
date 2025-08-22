package com.zoho.zohograduatestudies.assignment2.part1;

public class Qn3b
{
    public static void main(String args[])
    {
            int n=5;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-2;j++)
            {
                if(i==n)
                {
                    System.out.print(" ");

                }
                if(i<=n-2 && (i+j)>=n-1)
                {

                    System.out.print("w ");
                }

                else if(i>n-2 && (i+j)<=(n-2)*2)
                {

                    System.out.print(" w");
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
