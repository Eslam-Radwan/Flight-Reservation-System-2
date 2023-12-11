package edu.asu.mainPackage;

import java.util.ArrayList;

public class User extends ApplicationUser implements FlightSearch,BookingProcess{

    private static ArrayList<Booking> Bookings = new ArrayList<Booking>();

    public static void setBookings(Booking booking) {
        Bookings.add(booking);
    }

    public static ArrayList<Booking> getBookings() {
        return Bookings;
    }


}
