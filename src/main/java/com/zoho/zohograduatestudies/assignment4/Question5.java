package com.zoho.zohograduatestudies.assignment4;

/*
5. Create a class named Shape with a method that prints "This is a shape". Create another class named Polygon inheriting the Shape class with the same method that prints "Polygon is a shape". Create two other classes named Rectangle and Triangle having the same method which prints "Rectangle is a polygon" and "Triangle is a polygon" respectively. Again, make another class named Square having the same method which prints "Square is a rectangle".
Now, try calling the method by the object of each of these classes.*/

class Shape
{
    void display()
    {
        System.out.println("This is a shape");
    }
}
class Polygon extends Shape
{
    void display()
    {
        System.out.println("Polygon is a shape");
    }
}
class Rectangle extends Polygon
{
    void display()
    {
        System.out.println("Rectangle is a polygon");
    }
}
class Triangle extends Polygon
{
    void display()
    {
        System.out.println("Triangle is polygon");
    }
}

class Square extends Rectangle
{
    void display()
    {
        System.out.println("Square is  rectangle");
    }
}

public class Question5
{
    public static void main(String args[])
    {
        Shape obj=new Shape();
        obj.display();

        Polygon polygon=new Polygon();       // it is down casting and also here overriding is done
        polygon.display();

        Polygon rectangle=new Rectangle();      //it is up casting and override is implemented here
        rectangle.display();

        Shape tri=new Triangle();
        tri.display();

        Shape square=new Square();
        square.display();
    }
}
