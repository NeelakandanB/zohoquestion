package com.zoho.zohograduatestudies.assignment5.question3;

import java.util.Scanner;

public class Main
{
    public  static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        while(true)
        {
            System.out.println("==== Welcome ====");
            System.out.println("1.FullTime Employee ");
            System.out.println("2.PartTime Employee ");
            System.out.println("3.Contract Employee ");
            System.out.println("4.Exit");
            System.out.print("Enter the choice(1-4) : ");
            System.out.println();
            System.out.println("_____________________________________");

            int choice=scan.nextInt();
            scan.nextLine();

            switch( choice )
            {
                case 1 :

                    details(choice,2500);
                    break;

                case 2:

                    details(choice,1500);
                    break;

                case 3:

                    details(choice,1000);
                    break;

                case 4:

                    System.out.println("=== Exit ===");
                    System.exit(0);

                default:

                    System.out.println("invalid choice!!!");
            }


        }
    }


    private static void  details(int choice, double salary)
    {
        Scanner scan=new Scanner(System.in);
        Employees val=null;

        System.out.print("Enter the name : ");
        String name=scan.nextLine();

        System.out.print("Enter your age : ");
        int age =scan.nextInt();

        System.out.print("Enter the working days : ");
        int days=scan.nextInt();
        scan.nextLine();

        System.out.print("Enter the working location : ");
        String location=scan.nextLine();

        System.out.print("Enter the team name : ");
        String teamname=scan.nextLine();



         if(choice==1)
         {

             System.out.println("==== FullTime Employees ==== ");
             val=new FullTimeEmployee(name,age,days,location,teamname,salary);
         }

         else if(choice==2)
         {

             System.out.println("==== PartTime Employees ====");
             val=new PartTimeEmployee(name,age,days,location,teamname,salary);
         }

         else
         {

             System.out.println("==== Contract  Employees ==== ");
             val=new ContractEmployee(name,age,days,location,teamname,salary);
         }

         val.calculateSalary();
    }
}


