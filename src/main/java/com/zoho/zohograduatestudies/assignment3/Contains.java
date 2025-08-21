package com.zoho.zohograduatestudies.assignment3;

import java.util.Scanner;
public class Contains
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String original = "sharumathi";
        System.out.println("The Original String is : " + original);
        System.out.print("enter the string you need to check : ");
        String name = scan.nextLine();
        System.out.println(check(original,name));
    }

    private static  boolean check(String long1,String short1)
    {
        if (short1.length() > long1.length())
        {
            return false;
        }

        int start = 0;
        int i ;
        int l = long1.length();

        while (start < l-short1.length())
        {
            i = start + short1.length();
            if (long1.substring(start, i).equals(short1))
            {
                return true;
            }
            start++;
        }
        return false;
    }
}
