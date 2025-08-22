package com.zoho.zohograduatestudies.assignment1;

//1. Write a code to illustrate the various scope of variables(static, local, instance, block, final variables)?

import java.util.*;

public class Variable {
    int instance = 10;    //initialized instance variable/

    static int static2 = 10;   //initialized static variable

    final int finalValue = 50;  //initialized final variable

    public static void main(String args[]) {
        Variable instance1 = new Variable();

        int localVariable = 20;// initialized local variable

        System.out.println("the final variable is : " + instance1.finalValue);

        final int inalValue = 40;

        int finalValue = 20;  // here the final value was Changed

        System.out.println("The instance variable is : " + instance1.instance);

        System.out.println("The local variable is : " + localVariable);

        System.out.println("The final Variable is : " + finalValue);

        System.out.println("the static variable is : " + static2);

        {
            int blockVariable = 100; // initialized block variable//

            System.out.println("The blockvariable is : " + blockVariable);
        }

    }
}

//Write a program in which, declare all data types like integer, double, float, long integer, character and byte data and print them.


class Q2 {
    public static void main(String args[]) {
        byte value = 127;

        short variable = 14567;

        int variable2 = 22102345;

        long variable3 = 230202102003L;

        float value1 = 23.23020210f;

        double value2 = 1234.12358374634d;

        System.out.println("The byte variable : " + value);

        System.out.println("The  short variable is : " + variable);

        System.out.println("The  int variable is : " + variable2);

        System.out.println("The  long variable is : " + variable3);

        System.out.println("The  float variable is : " + value1);

        System.out.println("The  double variable is : " + value2);

    }
}


//3.Write a program to find the maximum of two numbers using ternary operator.

class Q3 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();

        int num2 = scan.nextInt();

        System.out.println("The maximum of two numbers is : " + ((num1 > num2) ? num1 : num2));
    }
}


//4. Write a program to check whether the given two numbers are equal or not w/o using comparison operator?


class WithoutComparision {
    public static void main(String args[]) {
        try {
            Scanner scan = new Scanner(System.in);
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            int num3 = num1 ^ num2;
            num2 = num1 / num3;
            System.out.print(false);
            scan.close();
        } catch (Exception e) {
            System.out.print(true);
        }


    }
}


//5. Write a program that illustrate the execution order of static block and initializer block?

class Q5 {

    int instanceVariable;

    {              //instance block

        System.out.println("This is the instance block of execution " + instanceVariable);

    }

    static {            // execution of static block

        int num1 = 20;
        System.out.println("This is the static block execution  " + num1);

    }

    public static void main(String args[]) {

        Q5 obj = new Q5();


    }

}


//6. Write a program that illustrate the Explicit type casting?

class TypeCasting {
    public static void main(String args[]) {

        long value = 1234594l;
        int value1 = (int) value;        //implemented explicit type casting
        int num1 = 125322;
        long num2 = num1;              //implemented implicit type casting
        System.out.println("The int value is : " + value1);
        System.out.println("The long value is : " + num2);

    }
}


//7. Write a program to check if a number is a power of 2?

class Q7 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = scan.nextInt();
        boolean val = false;
        while (number > 1) {
            val = false;
            if (number != 2 && number % 2 != 0) {

                break;

            } else if (number == 2 || number % 2 == 0) {

                val = true;

            }
            number /= 2;
        }
        if (val) {

            System.out.println("yes the number is power of 2");

        } else {

            System.out.print("no it is not a power of 2");

        }

    }
}


//8. Write a program to find the first set bit of a number?

class SetBitNumber {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the number : ");
        int num1 = scan.nextInt();
        int result = 0;
        int mod = 0;
        int count = 1;
        int temp = num1;

        while (num1 > 0) {
            mod = num1 % 2;
            result += count * mod;
            count *= 10;
            num1 /= 2;

        }
        System.out.println("Binary value of the given number is : " + result);
        int count1 = 0;

        while (result > 0) {
            count1++;
            if (result % 10 == 1) {
                break;
            }
            result /= 10;
        }
        System.out.print("The first set bit of a " + temp + " is : " + count1);

    }
}


// 9. Write a class Employee with attributes empId, name, department and salary and define a parametrized constructor Employee(int empId, String name, String department, double salary) and assign these variables to instance variables accordingly and display them?

class EmployeeDetails {
    int empId;
    String name;
    String department;
    double salary;

    EmployeeDetails(int empId, String name, String department, double salary) {
        System.out.println("employee id No is :" + empId);
        System.out.println("employee name is :" + name);
        System.out.println("employee Department is :" + department);
        System.out.println("employee salary is :" + salary);

    }

    public static void main(String args[]) {

        EmployeeDetails obj = new EmployeeDetails(2302, "Neelakandan", "Research and development", 50000.00);

    }
}


//10. Write a program to check whether the object is an instance of a particular class?


class Parent {

    void checkInstance() {

        System.out.println("yes the object is correct ");

    }
}

class Child extends Parent {

    void checkIt() {

        checkInstance();
    }

}

class Main {

    public static void main(String args[]) {

        Child obj = new Child();
        obj.checkIt();

        System.out.println(obj instanceof Parent);
        System.out.println(obj instanceof Object);
        System.out.println(obj instanceof Child);

    }
}

