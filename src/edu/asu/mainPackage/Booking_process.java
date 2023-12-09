package edu.asu.mainPackage;

import java.util.Scanner;

public interface Booking_process {
    public default void booking_process(int numberofpassengers, Flight flightinfo, int flightClass){
        Booking newbooking = new Booking(user.currentBookings+1, flightinfo, numberofpassengers, flightClass);
        Scanner scanner=new Scanner(System.in);
        System.out.println("welcome to booking");
        Flight flight=newbooking.getFlightinfo();
        double ticketFare=flight.classPrices[flightClass];
        for(int i=0;i<numberofpassengers;i++){
            System.out.printf("please Enter passenger %d first name:", i+1);
            String fname = scanner.nextLine();
            System.out.printf("please Enter passenger %d last name:", i+1);
            String lname = scanner.nextLine();
            System.out.printf("please Enter passenger %d ID:", i+1);
            String id = scanner.nextLine();
            System.out.printf("please Enter passenger %d Phone number:", i+1);
            String pnumber = scanner.nextLine();
            Passenger p = new Passenger(fname, lname, id, pnumber);
            Ticket ticket= new Ticket(p, ticketFare);
            newbooking.addTicket(ticket);
        }
        SeatSelection.seatselection(flightinfo, numberofpassengers, newbooking);
        PaymentProcess.paymentprocess(newbooking);
    }




}
