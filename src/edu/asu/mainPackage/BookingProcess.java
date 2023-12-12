package edu.asu.mainPackage;

import java.util.Scanner;

public interface BookingProcess extends PaymentProcess{
    default void bookingProcess(Booking booking) {
        //Booking booking = new Booking(user.currentBookings+1, flightinfo, numberofpassengers, flightClass);
        Scanner input = new Scanner(System.in);
        System.out.println("===============welcome to booking===============");
        Flight flight = booking.getFlight();
        double ticketFare = flight.getSeatPrice(booking.getFlightClass());
        for (int i = 0; i < booking.getNumberOfPassengers(); i++) {
            System.out.printf("please Enter passenger %d first name:", i + 1);
            String firstName = input.nextLine();
            System.out.printf("please Enter passenger %d last name:", i + 1);
            String lastName = input.nextLine();
            System.out.printf("please Enter passenger %d ID:", i + 1);
            int id = input.nextInt();
            Passenger passenger = new Passenger(firstName, lastName, id);
            Ticket ticket = new Ticket(passenger, ticketFare);
            booking.addTicket(ticket);
        }
        SeatSelection.seatSelection(flight, booking.getNumberOfPassengers(), booking);
        paymentProcess(booking);
    }


}
