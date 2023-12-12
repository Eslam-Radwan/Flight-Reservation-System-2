package edu.asu.mainPackage;

import java.util.ArrayList;
import java.util.Timer;

public class Booking {
    private int bookingID;
    private int numberOfPassengers;
    private int flightClass;
    private String bookingStatus;
    private ArrayList<Ticket> Tickets;
    private Flight flight;
    private Payment payment;


    public Booking(){}
    public Booking(int bookingID, Flight flight, int numberOfPassengers, int flightClass) {
        this.bookingID = bookingID;
        this.bookingStatus = "pending payment";
        this.flight = flight;
        this.flightClass=flightClass;
    }

    //Getters
    public int getBookingID() {
        return bookingID;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public Ticket[] getTicketinfo() {
        return ticketsinfo;
    }

    public Flight getFlight() {
        return flight;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public int getFlightClass() {
        return flightClass;
    }

    //setters
    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }


    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public void setFlightClass(int flightClass) {
        this.flightClass = flightClass;
    }

    public void setTicketseat(int index, Seat seat){
        Ticket ticket=this.ticketsinfo.get(index);
        ticket.setSeat(seat);
        this.ticketsinfo.set(index, ticket);
    }
    //adding
    public void addTicket(Ticket ticket){
        ticketsinfo.add(ticket);
    }
}
