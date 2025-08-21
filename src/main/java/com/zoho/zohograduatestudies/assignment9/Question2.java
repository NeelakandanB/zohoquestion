package com.zoho.zohograduatestudies.assignment9;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Question2
{
    public static void main(String[] args)
    {
        try(Scanner scan=new Scanner(System.in))
        {
            System.out.print("Enter the number : ");
            int num=scan.nextInt();
            scan.nextLine();
            System.out.print("Enter the number : ");
            String value1=scan.nextLine();

            System.out.print("Enter the number : ");
            String value2=scan.nextLine();

            int number1 =Integer.parseInt(value1);   // NumberFormatException
            int number2=Integer.parseInt(value2);

            double division=number1/number2;  //ArithmeticException
            System.out.println("The answer is : "+division);

        }

        catch (InputMismatchException | ArithmeticException | NumberFormatException  e)
        {

                System.out.println("caught Exception : "+e.getMessage()+" "+e.getClass().getName());

        }
    }
}
