package edu.asu.mainPackage;

import java.util.ArrayList;
import java.util.Scanner;

public interface UserWork {
    default int userWork(User user){
        int choice;
        choice = userMenu();
        if(choice == 1){
            Booking booking;
            booking = user.flightSearch();
            user.bookingProcess(booking);
            return 2;
        }
        else if(choice == 2){
            profile(user);
            return 2;
        }
        else if(choice == 3){
            return 1;
        }
        else if(choice == 4){
            return 0;
        }
        else{
            // out of the range
            // or
            // input string
        }
        return 2;
    }
    private int userMenu()
    {
        System.out.println("===============User Menu===============");
        System.out.println("[1]Search for a FLight");
        System.out.println("[2]Profile");
        System.out.println("[3]Logout");
        System.out.println("[2]Exit");
        System.out.print("Go To: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    private void profile(User user){
        System.out.println(user);
        System.out.println("[1]Booked Flights");
        System.out.println("[2]Back");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
    }
}
