package edu.asu.mainPackage;

import java.util.Scanner;

public interface BookingProcess {
     default void bookingProcess(Booking booking){
        //Booking booking = new Booking(user.currentBookings+1, flightinfo, numberofpassengers, flightClass);
        Scanner scanner=new Scanner(System.in);
        System.out.println("===============welcome to booking===============");
        Flight flight = booking.getFlightinfo();
        double ticketFare = flight.getSeatPrice(booking.getFlightClass());
        for(int i = 0; i < booking.getNumberOfPassengers(); i++){
            System.out.printf("please Enter passenger %d first name:", i+1);
            String firstName = scanner.nextLine();
            System.out.printf("please Enter passenger %d last name:", i+1);
            String lastName = scanner.nextLine();
            System.out.printf("please Enter passenger %d ID:", i+1);
            String id = scanner.nextLine();
            System.out.printf("please Enter passenger %d Phone number:", i+1);
            String passengerNumber = scanner.nextLine();
            Passenger passenger = new Passenger(firstName, lastName, id, passengerNumber);
            Ticket ticket = new Ticket(passenger, ticketFare);
            booking.addTicket(ticket);
        }
        SeatSelection.seatselection(flightinfo, numberofpassengers, booking);
        PaymentProcess.paymentprocess(booking);
    }




}
