package com.zoho.zohograduatestudies.assignment6.Question2.stringutils;

public class StringOperations
{
    public String conCatenation(String a,String b)
    {
        return a+b;
    }

    public String reverse(String a)
    {
        String result="";
        int n=a.length();
        for(int i=0;i<n;i++)
        {

            result=a.charAt(i)+result;
        }
        return result;
    }

    public int lengthOfString(String a)
    {
        int count = 0;
        for (int i = 0; i < a.length(); i++)
        {
             count++;
        }
        return count;
    }
}
