package com.zoho.zohograduatestudies.assignment4;

/*
22. Construct a base class called twoD contains x and y and methods to read and write the x and y. Create another class called threeD which is derived from twoD and also contains z and write methods to read and write z. Also write a method to find the distance of two threeD Points.
sqrt((x2-x1)^2+(y2-y1)^2+(z2-z1)^2)
In main:
Create one ThreeD object using the default constructor.
Use the setters to set x, y, and z.
Create the second ThreeD object using the constructor with three arguments.
in the TwoD class:
Add a cout statement to the TwoD default constructor with a message "TwoD default constructor"
Add a cout statement to other TwoD constructor with a message "TwoD constructor with two arguments"
*/

class TwoD {

     private int x ;
     private int y ;

     public TwoD()
     {
         System.out.println("TwoD default constructor");
     }


     public int getXValue() {

         return x;
     }

     public TwoD(int a,int b)
     {
             this.x=a;
             this.y=b;
             System.out.println("TwoD constructor with two arguments");
     }

     public int getYValue()
     {
         return y;
     }

     public void setValues(int a, int b)
     {
         x = a;
         y = b;
     }
 }

    class ThreeD extends TwoD
    {
        private int z;

        public ThreeD(){
        }

        public ThreeD(int a,int b,int c)
        {
            super(a,b);
            this.z=c;
        }

        public void findDistance(ThreeD values)
        {
            int x1=values.getXValue();
            int y1=values.getYValue();
            int z1=values.z;
            int x2=this.getXValue();
            int y2=this.getYValue();
            int z2=this.z;
            double sqrt=Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2))+(Math.pow((z2-z1),2)));
            System.out.printf("The distance of TwoD and ThreeD is : %.2f",sqrt);
        }

        public int getZValue()
        {
            return z;
        }
        public void setZValue(int c)
        {
             z=c;
        }
    }


public class SquareRoot
{
    public static void main(String args[])
    {
            ThreeD obj=new ThreeD();
            ThreeD values=new ThreeD(6,7,8);

            obj.setValues(3,4);
            obj.setZValue(5);
            obj.findDistance(values);

    }
}
