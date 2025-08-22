package com.zoho.zohograduatestudies.assignment2.part1;

public class Qn4b
{
    public static void main(String args[])
    {

        String str="ZOHOCORPORATIONS";
        int count=0;

        for(int i=0;i<str.length();i++)
        {
            if(count==4)
            {
                count=0;
                System.out.println();

            }

            count++;

            System.out.print(str.charAt(i)+" ");

        }
    }
}
