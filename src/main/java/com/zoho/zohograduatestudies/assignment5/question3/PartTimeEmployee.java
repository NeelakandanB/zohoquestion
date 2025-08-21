package com.zoho.zohograduatestudies.assignment5.question3;

public class PartTimeEmployee extends Employees
{

    private static int partTimeCount=1 ;
   // private double salary;
    //private int  workingDays;

    public PartTimeEmployee(String name ,int age ,int days,String location,String teamname,double salary)
    {
            super(name,age,days,location,teamname,salary);
      //  this.workingDays=days;
        // this.salary=salary;
    }

    public  void calculateSalary()
    {
        int daysCount=getDays();
        double salaryCount=getSalary();
        double calculation=daysCount*salaryCount;
        super.calculateSalary();
        System.out.println("Total salary of the employee is :"+calculation);
        System.out.println(" PartTime employess : "+partTimeCount++);
        System.out.println("_____________________________________________");

    }
}
