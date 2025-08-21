package com.zoho.zohograduatestudies.assignment9.question8;

import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        try (Scanner scan = new Scanner(System.in))
        {
            UserDetails obj = new UserDetails();
            String userName = obj.getUserName();
            String password = obj.getUserPassword();

            System.out.print("Enter your user Name :");
            String name = scan.nextLine();

            System.out.print("Enter your password : ");
            String pass=scan.nextLine();

            if(!userName.equals(name) || !password.equals(pass))
            {
                throw new AuthenticationException("invalid username or invalid password");
            }

            else
            {
                System.out.println("login successfully completed !!!");
            }

        }
        catch(Exception e)
        {
            System.out.println("caught exception : "+e.getMessage());
        }
    }

}
