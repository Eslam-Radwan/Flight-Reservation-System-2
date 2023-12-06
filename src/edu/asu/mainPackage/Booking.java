package edu.asu.mainPackage;

import java.util.ArrayList;

public class Booking {
    private int bookingID;
    private String bookingStatus;
    private ArrayList<Seat> seatinfo;
    private Flight flightinfo;
    private ArrayList<Passenger> passengersInBooking;


    public Booking(int bookingID, Flight flightinfo) {
        this.bookingID = bookingID;
        this.bookingStatus = "pending payment";
        this.flightinfo = flightinfo;
    }

    //Getters
    public int getBookingID() {
        return bookingID;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public Seat[] getSeatinfo() {
        return seatinfo;
    }

    public Flight getFlightinfo() {
        return flightinfo;
    }

    public Passenger[] getPassengersInBooking() {
        return passengersInBooking;
    }


    //setters
    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public void setSeatinfo(Seat[] seatinfo) {
        this.seatinfo = seatinfo;
    }

    public void setFlightinfo(Flight flightinfo) {
        this.flightinfo = flightinfo;
    }

    public void setPassengersInBooking(Passenger[] passengersInBooking) {
        this.passengersInBooking = passengersInBooking;
    }

    //adding
    public void addPassenger(Passenger passenger){
        passengersInBooking.add(passenger);
    }
    public void addSeat(Seat seat){
        seatinfo.add(seat);
    }
}
