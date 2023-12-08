package edu.asu.mainPackage;

public class Passenger {
    private String firstName;
    private String lastName;
    private int ID;
    private String phoneNumber;
    private Ticket ticketInfo;
    private  Booking bookingInfo;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Ticket getTicketInfo() {
        return ticketInfo;
    }

    public void setTicketInfo(Ticket ticketInfo) {
        this.ticketInfo = ticketInfo;
    }

    public Booking getBookingInfo() {
        return bookingInfo;
    }

    public void setBookingInfo(Booking bookingInfo) {
        this.bookingInfo = bookingInfo;
    }
    

}
