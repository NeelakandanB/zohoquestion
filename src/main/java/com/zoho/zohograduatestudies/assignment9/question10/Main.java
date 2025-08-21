package com.zoho.zohograduatestudies.assignment9.question10;


import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        try(Scanner scan=new Scanner(System.in))
        {
            System.out.println("Enter your age");
            int age=scan.nextInt();

            if(age<18)
            {
                throw new InEligibleAgeException("Ineligible age");
            }
            else
            {
                System.out.println("Eligible for vote ");
            }
        }

        catch(InEligibleAgeException e)
        {
            System.out.println("caught Exception : "+ e.getMessage());
        }
    }
}
