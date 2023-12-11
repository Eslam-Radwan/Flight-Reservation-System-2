package edu.asu.mainPackage;

import java.util.ArrayList;
import java.util.Scanner;

public interface UserWork {
    default void userWork(ArrayList<Flight> Flights){
        int choice;
        choice = userMenu();
        if(choice == 1){
            User user = new User();
            Booking booking;
            booking = user.flightSearch(Flights);
            user.bookingProcess(booking);
        }
        else if(choice == 2){
            User.Profile();
        }
    }
    private static int userMenu()
    {
        System.out.println("===============User Menu===============");
        System.out.println("[1]Search for a FLight");
        System.out.println("[2]Profile");
        System.out.print("Go To: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
