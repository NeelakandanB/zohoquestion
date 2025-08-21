package com.zoho.zohograduatestudies.assignment9.question3;

import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        try
        {
            Scanner scan= new Scanner(System.in);
            Class.forName("com.zoho.zohograduatestudies.assignment9.question3.ClassIsAvailable");
            System.out.println("ClassIsAvailable found");
            System.out.println(Class.forName("Scanner")+"  found");
            System.out.println(Class.forName("Division")+"  found");
        }

        catch (Exception e)
        {
             System.out.println("class Not Found ! "+e.getMessage());

        }
    }
}
