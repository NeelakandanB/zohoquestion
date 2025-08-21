package com.zoho.zohograduatestudies.assignment9;

import java.util.*;

public class Question5
{

    public static void main(String[] args)
    {

        System.out.println("The result is : " + print());

    }

    private static  int print()
    {
        try(Scanner scan=new Scanner(System.in))
        {

            System.out.println("enter the number :");
            int number =scan.nextInt();
            return number;

        }

        catch(Exception e)
        {

            System.out.println("caught exception :"+e.getMessage()+" "+e.getClass().getName());

        }

        finally
        {

              System.out.println("Finally is running");

        }
        System.out.println("you had given the wrong answer");
        return 1;
    }
}
