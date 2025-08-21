package com.zoho.zohograduatestudies.assignment5.question3;
/*
3. Create a Java application to manage employees in a company. Define a base class Employee with a method
        calculateSalary(). Then create two subclasses FullTimeEmployee, PartTimeEmployee and ContractEmployee that
override calculateSalary() method based on their working type.

 */
public class Employees
{
    private static int totalCount=1;
    private String employeeName;
    private int age;
    private int workingDays;
    private String workinglocation;
    private String  teamName;
    private double salary;



    public Employees(){}


    public  Employees(String name, int age,int days,String location,String teamname,double salary)
    {
        this.employeeName=name;
        this.age=age;
        this.workingDays=days;
        this.salary=salary;
        this.workinglocation=location;
        this.teamName=teamname;

    }
    public int  getDays()
    {
        return workingDays;
    }
    public double getSalary()
    {
        return salary;
    }


    public void calculateSalary()
    {
        System.out.println("Employee name : "+employeeName);
        System.out.println("Employee age : "+age);
        System.out.println("Working days : "+workingDays);
        System.out.println("salary per day : "+salary);
        System.out.println("working location : "+workinglocation);
        System.out.println("Team name :  "+teamName);
        System.out.println("Total count of the employees : "+totalCount++);
    }
}
