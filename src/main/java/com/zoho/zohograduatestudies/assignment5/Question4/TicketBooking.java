package com.zoho.zohograduatestudies.assignment5.Question4;

public class TicketBooking
{

    private static int ticketIdNo = 1;
    private String passengerName;
    private String departureLocation;
    private String arrivalLocation;
    private String dateOfTravel;
    private String timeOfDeparture;
    private String timeOfArrival;
    private double totalfare;
    private String seatNO;


    public TicketBooking(String passengername,String deplocation,String arrivallocation,String date,String deptime,String arrivaltime,double price,String seatno)
    {
        this.passengerName=passengername;
        this.departureLocation=deplocation;
        this.arrivalLocation=arrivallocation;
        this.dateOfTravel=date;
        this.timeOfDeparture=deptime;
        this.timeOfArrival=arrivaltime;
        this.totalfare=price;
        this.seatNO=seatno;

    }

    public void display()
    {
        System.out.println("____________________________");
        System.out.println("Ticket id :  "+ticketIdNo++);
        System.out.println("departure location : "+departureLocation);
        System.out.println("arrival location : "+arrivalLocation);
        System.out.println("date of travel : "+dateOfTravel);
        System.out.println("departure time : "+timeOfDeparture);
        System.out.println("arrival time : "+timeOfArrival);
        System.out.println("Total fare  : "+totalfare);
        System.out.println("seat number : "+seatNO);
    }

}
