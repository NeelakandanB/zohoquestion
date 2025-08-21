package com.zoho.zohograduatestudies.assignment6.Question3;

import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
       EmployeeDetails employee=new EmployeeDetails();
       employee.display();

        while(true)
        {
            System.out.println("=== welcome ===");
            System.out.println("1.Employee details");
            System.out.println("2.Exit");
            System.out.print("Enter the choice (1 or 2) : ");
            int choice=scan.nextInt();

            switch( choice )
            {
                case 1:

                    getDetails();
                    break;

                case 2:

                    System.out.println("Exit>>");
                    System.exit(0);

                default:

                    System.out.println("Invalid choice!! Enter the valid choice ");
                    break;
            }
        }
    }


    private static void getDetails()
    {
        EmployeeDetails employee2=new EmployeeDetails();

        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Employee id : ");
        long empId=scan.nextLong();
        scan.nextLine();

        System.out.print("Enter the Employee name : ");
        String name=scan.nextLine();

        System.out.print("Enter the department : ");
        String department=scan.nextLine();

        System.out.print("Enter the designation : ");
        String role=scan.nextLine();

        System.out.print("Enter the monthy salary : ");
        double salary=scan.nextDouble();

        employee2.setEmployeeId(empId);
        employee2.setEmployeeName(name);
        employee2.setDepartment(department);
        employee2.setDesignation(role);
        employee2.setMonthlySalary(salary);

        employee2.display();
    }
}
