package com.zoho.zohograduatestudies.assignment5.Question4;


import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        while(true)
        {
            System.out.println("==== welcome ====");
            System.out.println("1.Flight ticket booking");
            System.out.println("2.Train Ticket Booking");
            System.out.println("3.bus ticket Booking");
            System.out.println("4.Exit");
            System.out.print("enter the choice (1-3) : ");

            int choice = scan.nextInt();

            switch ( choice )
            {
                case 1 :

                     print(choice,50000);
                     break;

                case 2:

                    print(choice,2000);
                    break;

                case 3:

                    print(choice,1500);
                    break;

                case 4:

                    System.out.println("Exit>>>>>");
                    System.exit(0);
                    break;

                default:

                    System.out.println("invalid choice !!!");
                    break;
            }
        }
    }

    private static void print(int choice,int price)
    {
        Scanner scan = new Scanner(System.in);
        String[] strArr = {"", "Flight", "Train", "Bus"};
        TicketBooking var=null;

        System.out.println("you clicked " + strArr[choice] + "ticket booking");
        System.out.print("Enter your name : ");
        String name = scan.nextLine();

        System.out.print("Enter the departure location : ");
        String depLocation = scan.nextLine();

        System.out.print("Enter the arrival location : ");
        String endLocation = scan.nextLine();

        System.out.print("enter the date of travel : ");
        String date = scan.nextLine();

        System.out.print("enter the departure time : ");
        String depTime = scan.nextLine();

        System.out.print("Enter the arrival time :  ");
        String arrivalTime = scan.nextLine();

        System.out.print("enter the seat number : ");
        String seatNo = scan.nextLine();

        System.out.print("Enter the " + strArr[choice] + " name :");
        String vehicleName = scan.nextLine();


        System.out.print("Enter the" + strArr[choice] + " number : ");
        long vehicleNo = scan.nextLong();
        scan.nextLine();

        System.out.print("Enter the " + strArr[choice] + " type : ");
        String classType = scan.nextLine();

        if (choice == 1)
        {
            var = new FlightTicket(name,depLocation,endLocation,date,depTime,arrivalTime,price,seatNo,vehicleName,vehicleNo,classType);

        }

        else if ( choice == 2)
        {
            System.out.print("Enter the coach number : ");
            String coachno=scan.nextLine();

            var =new TrainTicket(name,depLocation,endLocation,date,depTime,arrivalTime,price,seatNo,vehicleNo,classType,5,23021123l,coachno);
        }

        else
        {
            System.out.print("boarding puint :  ");
            String boardpoint=scan.nextLine();
            System.out.print("dropping point : ");
            String dropPoint=scan.nextLine();

            var=new BusTicket(name,depLocation,endLocation,date,depTime,arrivalTime,price,seatNo,vehicleName,vehicleNo,boardpoint,dropPoint,classType);
        }

        var.display();
        System.out.println("booked successfully yay!!!!");

    }

}
