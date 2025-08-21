package com.zoho.zohograduatestudies.assignment3.question6;

public class Main
{
    public static void main(String[] args)
    {
            StringMethods string = new StringMethods("videogame");

            System.out.println("Length : " + string.length());
            System.out.println("Char At : " + string.charAt(1));
            System.out.println("Equal or not : " + string.isequals("VideoGame"));
            System.out.println("TO Upper : " + string.toUpper());
            System.out.println("To Lower : " + string.toLower());
            System.out.println("Contains : " + string.contain("game"));
            System.out.println("Substring : " + string.substr(2, 4));
            System.out.println("Concatenation : " + string.concat("summerTimes"));
            System.out.println("Index of : " + string.indexOf('e'));
            System.out.println("Replace : " + string.replace( 'a', 'v'));
    }

}

