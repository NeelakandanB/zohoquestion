package com.zoho.zohograduatestudies.assignment5.question3;

public class FullTimeEmployee extends Employees
{
    private static int fullTimeCount=1;
   // private int  workingDays;
   // private double salary;

    public  FullTimeEmployee(String name ,int age,int days,String location,String teamname,double salary)
    {
        super(name,age,days,location,teamname,salary);
      // this.workingDays=days;
       // this.salary=salary;

    }

    public void calculateSalary()
    {
            int daysCount=getDays();
            double salaryCount=getSalary();

            double calculation=daysCount*salaryCount;
            super.calculateSalary();

            System.out.println("Total salary of the employee is :"+calculation);
            System.out.println("Full time employee count : "+fullTimeCount++);
            System.out.println("_____________________________________________");
    }

}
