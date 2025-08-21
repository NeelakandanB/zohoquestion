package com.zoho.zohograduatestudies.assignment9;

import java.util.Scanner;

public class Question4
{
    public static void main(String args[])
    {
         try(Scanner scan=new Scanner(System.in))
         {
                System.out.print("Enter the number :");
                String number=scan.nextLine();

                int convert=Integer.parseInt(number);
                System.out.println("converted to integer"+convert);

         }

         catch (Exception e)
         {

             System.out.println(" caught exception : "+e.getMessage()+" "+e.getClass().getName());

         }
    }
}
