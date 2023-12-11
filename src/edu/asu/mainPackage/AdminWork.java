package edu.asu.mainPackage;

import java.util.ArrayList;
import java.util.Scanner;

public interface AdminWork {

    default void adminWork(ArrayList<Flight> Flights){
        int choice;
        choice = adminMenu();
        if(choice == 1){
            Flight flight;
            flight = Admin.addFlight();
            Flights.add(flight);
        }
        else if(choice == 2){
            Admin.updateFlight(Flights);
        }
        else if(choice == 3){
            Admin.deleteFlight(Flights);
        }
        else if(choice == 4)
        {
            Admin.setSeatAvailability(Flights);
        }
        else{
            // out of the range
            // or
            // input string
        }
    }
    private static int adminMenu(){
        System.out.println("===============Admin Menu===============\n\n");
        System.out.println("[1]Add a Flight");
        System.out.println("[2]Update a Flight");
        System.out.println("[3]Delete a Flight");
        System.out.println("[4]Edit Seat Availability");
        System.out.print("Go to: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();

    }
}
