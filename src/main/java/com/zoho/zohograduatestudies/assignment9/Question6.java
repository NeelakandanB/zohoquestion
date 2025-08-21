package com.zoho.zohograduatestudies.assignment9;

import java.util.*;
/*
6. Write a Java program to accept a 4-digit ATM PIN from the user and validate whether it meets the following
conditions:
        --->It must be exactly 4 digits long.
        --->It should contain only numeric characters.
        --->It must not start with 0.
Display an appropriate message whether the PIN is valid or invalid.

 */

public class Question6
{
    public static void main(String args[])
    {
        try(Scanner scan=new Scanner(System.in))
        {
            System.out.print("Enter the ATM pin (4 digits) :");
            String pin=scan.nextLine();
            int number=Integer.parseInt(pin);

            if(pin.charAt(0)>='1' && pin.charAt(0)<='9' && pin.length()==4)
            {
                System.out.print("PIN is valid, so move to the next process ");
            }
            else
            {
                System.out.print("PIN is invalid (Note : Enter the 4 digit valid pin )");
            }
        }
        catch(Exception e)
        {
            System.out.println("caught exception : "+e.getMessage()+" "+e.getClass().getName());
        }
    }
}
