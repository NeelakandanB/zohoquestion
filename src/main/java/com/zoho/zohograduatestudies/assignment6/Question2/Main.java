package com.zoho.zohograduatestudies.assignment6.Question2;


import com.zoho.zohograduatestudies.assignment6.Question2.arithmetic.ArithmeticOperations;
import com.zoho.zohograduatestudies.assignment6.Question2.stringutils.StringOperations;

public class Main
{
    public static void main(String args[])
    {
        ArithmeticOperations arithmetic=new ArithmeticOperations();

        System.out.println("the addition  of two numbers : "+arithmetic.addition(2,4));
        System.out.println("The substraction of two numbers : "+arithmetic.substraction(10,12));
        System.out.println("The Multiplication of two numbers : "+ arithmetic.multiplication(2,4));
        System.out.println("The division of two numbers : "+ arithmetic.division(100,2));
        System.out.println("The modulo of two numbers : "+arithmetic.modulo(10,2));

        StringOperations string=new StringOperations();

        System.out.println("The length  of the String : "+ string.lengthOfString("neelakandan"));
        System.out.println("The reverse  of the string : "+string.reverse("zohoGraduateStudies"));
        System.out.println("The concatenation of two Strings  : "+string.conCatenation("neels","moon"));
    }
}
