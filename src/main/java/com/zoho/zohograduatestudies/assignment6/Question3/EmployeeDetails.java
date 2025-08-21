package com.zoho.zohograduatestudies.assignment6.Question3;

public class EmployeeDetails {
    private long employeeId = 2302102;
    private String employeeName = "neelakandan";
    private String department = "iOSTeam";
    private String designation = "developer";
    private double monthlySalary = 50000;


    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }


    public void calculateAnnualSalary() {
        System.out.println("The annual salary of the employee is : " + (12 * monthlySalary));
    }

    public void display() {

        System.out.println("Employee id : " + employeeId);
        System.out.println("Employee name :" + employeeName);
        System.out.println("department : " + department);
        System.out.println("designation : " + designation);
        System.out.println("monthly salary : " + monthlySalary);
        calculateAnnualSalary();
        System.out.println("___________________________________");

    }
}

