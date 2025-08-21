package com.zoho.zohograduatestudies.assignment5.Question4;

public class BusTicket extends TicketBooking
{
    String travelsName;
    long busNumber;
    String boardingPoint;
    String dropPoint;
    String busType;

    public BusTicket(String passengername,String deplocation,String arrivallocation,String date,String deptime,String arrivaltime,double price,String seatno,String busname,long busno,String boardpoint,String droppoint,String classtype)
    {
        super(passengername,deplocation,arrivallocation,date,deptime,arrivaltime,price,seatno);
        this.travelsName=busname;
        this.busNumber=busno;
        this.boardingPoint=boardpoint;
        this.dropPoint=droppoint;
        this.busType=classtype;
    }

    public void display()
    {
        super.display();
        System.out.println("Travels name : "+travelsName);
        System.out.println("Bus number : "+busNumber);
        System.out.println("Boarding point : "+boardingPoint);
        System.out.println("Dropping point : "+dropPoint);
        System.out.println("class Type :  "+busType);
        System.out.println("________________________________________");

    }

}


