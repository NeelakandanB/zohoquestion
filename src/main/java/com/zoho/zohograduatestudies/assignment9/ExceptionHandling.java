package com.zoho.zohograduatestudies.assignment9;

/*
1. int[] arr = {2, 5, 1, 4, 0, 7};
int quotient = arr[7] / arr[4];
Develop a Java program which handles any unexpected situations that may arise during execution.
 */

public class ExceptionHandling
{
    public static void main(String[] args)
    {
        try
        {
            int  arr[]={2,5,1,4,0,7};
            int quotient=arr[7]/arr[4];
        }

        catch (Exception e)
        {
            System.out.println("caught Excaption "+e.getClass().getName());
        }
    }
}
