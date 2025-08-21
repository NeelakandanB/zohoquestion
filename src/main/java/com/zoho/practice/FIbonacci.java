package com.zoho.practice;

public class FIbonacci
{
    public static void main(String args[])
    {
        int []arr=new int[30];
        arr[1]=1;
        int i=2;
        System.out.print(arr[0]+" ");
        System.out.print(arr[1]+" ");

        while(i<=arr.length-1)
        {

            arr[i]=arr[i-1]+arr[i-2];
            System.out.print(arr[i]+" ");;
            i++;

        }
    }
}
