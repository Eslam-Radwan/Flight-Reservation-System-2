package edu.asu.mainPackage;

import java.util.ArrayList;
import java.util.Scanner;

import static edu.asu.mainPackage.WorkFlow.Flights;

public interface AdminWork {

    default int adminWork(Admin admin){
        int choice;
        choice = adminMenu();
        if(choice == 1){
            Flight flight;
            flight = admin.addFlight();
            Flights.add(flight);
        }
        else if(choice == 2){
            admin.updateFlight();
        }
        else if(choice == 3){
            admin.deleteFlight();
        }
        else if(choice == 4)
        {
            admin.setSeatAvailability();
        }
        else if (choice == 5){
            return 1;
        }
        else if(choice == 6){
            return 0;
        }
        else{
            // out of the range
            // or
            // input string
        }
        return 2;
    }
    private static int adminMenu(){
        System.out.println("===============Admin Menu===============\n\n");
        System.out.println("[1]Add a Flight");
        System.out.println("[2]Update a Flight");
        System.out.println("[3]Delete a Flight");
        System.out.println("[4]Edit Seat Availability");
        System.out.println("[5]Logout");
        System.out.println("[6]Exit");
        System.out.print("Go to: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();

    }
}
