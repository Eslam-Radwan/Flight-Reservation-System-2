package edu.asu.mainPackage;

import java.util.ArrayList;
import java.util.Timer;

public class Booking {
    private int bookingID, numberOfPassengers, flightClass;
    private String bookingStatus;
    private ArrayList<Ticket> ticketsinfo;
    private Flight flightinfo;



    public Booking(int bookingID, Flight flightinfo, int numberOfPassengers, int flightClass) {
        this.bookingID = bookingID;
        this.bookingStatus = "pending payment";
        this.flightinfo = flightinfo;
        this.flightClass=flightClass;
    }

    //Getters
    public int getBookingID() {
        return bookingID;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public ArrayList<Ticket> getTicketinfo() {
        return ticketsinfo;
    }

    public Flight getFlightinfo() {
        return flightinfo;
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


    public void setFlightinfo(Flight flightinfo) {
        this.flightinfo = flightinfo;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public void setFlightClass(int flightClass) {
        this.flightClass = flightClass;
    }

    public void setTicketseat(int index, Seat seat){
        Ticket ticket=this.ticketsinfo.get(index);
        ticket.setPassengerSeat(seat);
        this.ticketsinfo.set(index, ticket);
    }
    //adding
    public void addTicket(Ticket ticket){
        ticketsinfo.add(ticket);
    }
}
