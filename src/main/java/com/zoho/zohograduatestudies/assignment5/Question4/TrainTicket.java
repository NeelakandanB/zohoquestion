package com.zoho.zohograduatestudies.assignment5.Question4;

public class TrainTicket extends TicketBooking
{
    private long trainNumber;
    private String coachType;
    private int platformNumber;
    private long pnrNumber;
    private String coachNumber;

    public TrainTicket(String passengername,String deplocation,String arrivallocation,String date,String deptime,String arrivaltime,double price,String seatno,long trainnumber,String coachtype,int platform,long pnrno,String coachno)
    {
        super(passengername,deplocation,arrivallocation,date,deptime,arrivaltime,price,seatno);
        this.trainNumber=trainnumber;
        this.coachType=coachtype;
        this.platformNumber=platform;
        this.pnrNumber=pnrno;
        this.coachNumber=coachno;

    }

    public void display()
    {
        super.display();
        System.out.println("Train number : "+trainNumber);
        System.out.println("class type : "+coachType);
        System.out.println("platform Number : "+platformNumber);
        System.out.println("PNR number : "+pnrNumber);
        System.out.println("coach number :"+coachNumber);
        System.out.println("___________________________________");

    }

}
