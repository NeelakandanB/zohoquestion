package com.zoho.zohograduatestudies.assignment4;
/*
1. We want to store the information about different vehicles. Create a class named Vehicle with two data member named mileage and price. Create its two subclasses
---Car with data members to store ownership cost, warranty (by years), seating capacity and fuel type (diesel or petrol).
---Bike with data members to store the number of cylinders, number of gears, cooling type(air, liquid or oil), wheel type(alloys or spokes) and fuel tank size(in inches)
Make another two subclasses Audi and Ford of Car, each having a data member to store the model type.
Next, make two subclasses Bajaj and TVS, each having a data member to store the make-type.
Now, store and print the information of an Audi and a Ford car (i.e. model type, ownership cost, warranty, seating capacity, fuel type, mileage and price.) Do the same for a Bajaj and a TVS bike.
 */
public class Vehicles
{
    double mileage;
     double price;

    public Vehicles(double mileage, double price)
    {

           this.mileage = mileage;
           this.price = price;
    }
}

class Car extends Vehicles
{
    double ownershipCost;
    int warranty;
    int seatingCapacity;
    String fuelType;

        public Car(double mileage,double price,double ownerprice,int warranty,int seating,String fueltype)
        {
                  super(mileage,price);
                  this.ownershipCost=ownerprice;
                  this.warranty=warranty;
                  this.seatingCapacity=seating;
                  this.fuelType=fueltype;
        }
}

 class Bike extends Vehicles
{
     int cylinders;
     int gears;
     String coolingType;
     String wheelType;
     double fuelTankSize;

    public Bike(double mileage,double price,int cylinders, int gears,String coolingtype,String wheeltype,double tanksize)
    {
        super(mileage,price);
        this.cylinders = cylinders;
        this.gears = gears;
        this.coolingType = coolingtype;
        this.wheelType = wheeltype;
        this.fuelTankSize = tanksize;
    }
}




   class Audi extends Car
   {
         private  String modelType;

         public Audi(String model,double mileage,double price,double ownershipcost,int warranty,int seatingcapacity,String fueltype)
         {

                 super(mileage, price, ownershipcost, warranty, seatingcapacity, fueltype);
                 this.modelType = model;

          }

              public void displayAudiDetails()
              {

                          System.out.println("Audi car details :");
                          System.out.println("model type  :"+modelType);
                          System.out.println("mileage  :"+mileage);
                          System.out.println("price  :"+price);
                          System.out.println("ownership cost   :"+ownershipCost);
                          System.out.println("warranty :"+warranty);
                          System.out.println("seating capacity  :"+seatingCapacity);
                          System.out.println("fueltype  :"+fuelType);
                          System.out.println("_________________________________");

              }
   }



class Ford extends Car
{
     private String modelType;

      public Ford(String model,double mileage,double price,double ownershipcost,int  warranty,int seatingcapacity,String fueltype)
     {
            super(mileage,price,ownershipcost,warranty,seatingcapacity,fueltype);
            this.modelType=model;
     }

      public void displayFordDetails()
      {
          System.out.println("Ford car details :");
          System.out.println("model type  :"+modelType);
          System.out.println("mileage  :"+mileage);
          System.out.println("price  :"+price);
          System.out.println("ownership cost   :"+ownershipCost);
          System.out.println("warranty :"+warranty);
          System.out.println("seating capacity  :"+seatingCapacity);
          System.out.println("fueltype  :"+fuelType);
          System.out.println("_________________________________");
      }
}

class Tvs extends Bike
{
    private String modelType;

    public Tvs(String model, double mileage, double price, int cylinders, int gears, String coolingtype, String wheeltype, double tanksize)
    {
        super(mileage, price, cylinders, gears, coolingtype, wheeltype, tanksize);
        this.modelType = model;
    }

    public void displayTvsDetails()
    {
        System.out.println("Tvs Bike details :");
        System.out.println("model type  :"+modelType);
        System.out.println("mileage  :"+mileage);
        System.out.println("price  :"+price);
        System.out.println("No of cylinders   :"+cylinders);
        System.out.println("no of gears :"+gears);
        System.out.println("cooling type  :"+coolingType);
        System.out.println("Wheel type  :"+wheelType);
        System.out.println("fuel tank size  :"+fuelTankSize);
        System.out.println("_________________________________");
    }
}

    class Bajaj extends Bike
{
    private String modelType;

     public Bajaj(String model,double mileage,double price,int cylinders, int gears,String coolingtype,String wheeltype,double tanksize)
    {
        super(mileage,price,cylinders,gears,coolingtype,wheeltype,tanksize);
        this.modelType=model;
    }

    public void displayBajajDetails()
    {
        System.out.println("Bajaj Bike details :");
        System.out.println("model type  :"+modelType);
        System.out.println("mileage  :"+mileage);
        System.out.println("price  :"+price);
        System.out.println("No of cylinders   :"+cylinders);
        System.out.println("no of gears :"+gears);
        System.out.println("seating capacity  :"+coolingType);
        System.out.println("fueltype  :"+wheelType);
        System.out.println("fueltype  :"+fuelTankSize);
        System.out.println("_________________________________");
    }
}

class Main
{
    public static void main(String args[])
    {

        Audi audi=new Audi("Audi Q7",30,1200000,100000,1,5,"diesel");
        Ford ford=new Ford("ford mustang",20,3500000,2300000,2,7,"diesel");
        Tvs tvs=new Tvs("Apache RR 310 ",50,150000,2,5,"liquid","Alloys",30);
        Bajaj bajaj=new Bajaj("Platina",70,120000,2,5,"liquid","Alloys",28);

        audi.displayAudiDetails();
        ford.displayFordDetails();
        tvs.displayTvsDetails();
        bajaj.displayBajajDetails();

    }
}
