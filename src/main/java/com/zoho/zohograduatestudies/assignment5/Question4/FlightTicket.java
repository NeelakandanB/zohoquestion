package com.zoho.zohograduatestudies.assignment5.Question4;

public class FlightTicket extends TicketBooking {

    private String airLineName;
    private long flightNumber;
    private long terminalNumber;
    private int gateNumber;
    private String classType;

    public FlightTicket(String passengername,String deplocation,String arrivallocation,String date,String deptime,String arrivaltime,double price,String seatno,String airlinename,long flightno,String classtype)
    {
        super(passengername,deplocation,arrivallocation,date,deptime,arrivaltime,price,seatno);
        this.airLineName=airlinename;
        this.flightNumber=flightno;
        this.classType=classtype;
    }

    public void display()
    {
        super.display();
        System.out.println("AirLine name :"+airLineName);
        System.out.println("Flight number : "+flightNumber);
        System.out.println("terminal number : "+terminalNumber);
        System.out.println("gate number : "+gateNumber);
        System.out.println("Class type : "+classType);
        System.out.println("______________________________________");
    }

}
