package com.zoho.zohograduatestudies.assignment9;

import java.util.*;
/*
7. Write a Java program that shows exception propagation across multiple methods (method1 calls method2 calls
method3, which throws the exception). Handle the exception in method1.
 */
public class Question7
{
    public static void main(String args[])
    {
        call();
    }

    private static void call()
    {
        try(Scanner scan=new Scanner(System.in))
        {
            System.out.print("Enter the number : ");
            int number = scan.nextInt();
            method(number);

        }

        catch(Exception e)
        {
            System.out.println("caught exception : "+e.getMessage()+" "+e.getClass().getName());
        }

    }
    private  static void method(int n)throws Exception
    {
        divide(n);
    }

    private static void divide(int m)
    {
        double divide=m/0;
        System.out.println("The answer is : "+divide);
    }
}
