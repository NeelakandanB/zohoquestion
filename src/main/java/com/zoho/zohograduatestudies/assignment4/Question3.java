package com.zoho.zohograduatestudies.assignment4;
import java.sql.SQLOutput;
import java.util.*;

 class Point
 {
     private int x;
     private int y;

     public Point()
     {
         int x=0;
         int y=0;
     }

     public void setValues(int a,int b)
     {
         x=a;
         y=b;
     }

     public int getX()
     {
         return x;
     }
     public int getY()
     {
         return y;
     }

}

class Circle extends Point {
    private double radius;

    public Circle() {
    }

    public double getRadiius() {
        return radius;
    }

    public void setRadius(double radiusValue)
    {
        if (radiusValue > 0)
        {
            radius = radiusValue;
        }
        else
        {
            radius = 1;
        }

    }

    public void print()
    {
        System.out.println("circle centre is  : "+"("+this.getX()+","+this.getY()+")");
        System.out.println("The final Radius is :"+radius);
        double area = 3.14 * (radius * radius);
        System.out.println("Area of circle is : "+area);

    }
}

public class Question3
{
        public static void main(String args[])
        {
            Scanner scan=new Scanner(System.in);
            System.out.print("enter x value : ");
            int  a=scan.nextInt();
            System.out.print("enter y value : ");
            int b=scan.nextInt();
            System.out.print("enter the initial Radius : ");
            double R=scan.nextDouble();

            Circle obj=new Circle();
            obj.setRadius(R);
            obj.setValues(a,b);
            obj.getRadiius();
            obj.print();
        }
}
