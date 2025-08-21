package com.zoho.zohograduatestudies.assignment9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class Question9
{
    public static void main(String args[])
    {
         BufferedReader reader=null;

        try
        {
         reader=new BufferedReader(new FileReader("D:\\ZSGSDayAssignment - Copy\\src\\main\\java\\com\\zoho\\practice\\Damond.java"));

            String line;
            while((line=reader.readLine())!=null)
            {
                System.out.println(line);
            }

        }
        catch (IOException e)
        {
            System.out.println("caught Exception : "+e.getMessage());
            System.out.println("Error name : "+e.getClass().getName());
        }

        finally
        {
            if(reader!=null)
            {
                try
                {
                    reader.close();
                    System.out.println("file closed successfully !!");
                }
                catch(Exception e)
                {
                    System.out.println("Error caught : "+e.getMessage()+ " "+e.getClass().getName());
                }
            }
        }
    }

}
