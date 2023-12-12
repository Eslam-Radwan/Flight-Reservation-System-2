package edu.asu.mainPackage;

import java.util.ArrayList;

public class User extends ApplicationUser implements FlightSearch, BookingProcess {

    private static ArrayList<Booking> Bookings = new ArrayList<Booking>();

//    public User(ApplicationUser user){
//        this.setFirstName(user.getFirstName());
//        this.setLastName(user.getLastName());
//        this.setPassword(user.getPassword());
//        this.setEmailAddress(user.getEmailAddress());
//        this.setFirstName(user.getFirstName());
//        this.setUser(true);
//    }
    public static void setBookings(Booking booking) {
        Bookings.add(booking);
    }

    public static ArrayList<Booking> getBookings() {
        return Bookings;
    }

    @Override
    public String toString() {
        return "First Name: " + this.getFirstName() + "Last Name: " + this.getLastName() +
                "Username: " + this.getUsername() + "Email Address: " + this.getEmailAddress();
    }
}
