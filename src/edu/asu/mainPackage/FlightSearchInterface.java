package edu.asu.mainPackage;

import java.util.ArrayList;
import java.util.Scanner;

public interface FlightSearch {
    String username;
    String Email;

    default void flightSearch(ArrayList<Flight> Available_Flights){
        Flight Seleceted_Flight = new Flight();

        boolean Selected_A_Flight=false;
        Scanner input = new Scanner(System.in);

        // Setting the Attributes that the user searched for
        System.out.println("Enter your Desired departure Airport: ");
        Seleceted_Flight.setDepartureAirport(input.next());

        System.out.println("Enter your Desired arrival Airport: ");
        Seleceted_Flight.setArrivalAirport(input.next());

        System.out.println("Enter your Desired Seat Class: ");
        System.out.println("Press 0 for Economic Class");
        System.out.println("Press 1 for Business Class");
        System.out.println("Press 2 for First Class");
        int SeatClass = input.nextInt();
        System.out.println("Enter your Desired number of seats: ");
        int NumberOfSeats = input.nextInt();


        // searching the database for flights with the same attributes that the user selected
        Available_Flights.stream().filter(flights -> (Seleceted_Flight.equal(flights) && flights.getNumberofAvailableSeats(SeatClass)>=NumberOfSeats))
                .forEach( flights -> {
                        int is_Selected=0;
                        if(Selected_A_Flight) {
                           return;
                        }
                        FlightSearchRepresentation(flights);
                        System.out.println("Press 1 to Select Flight"+"\n"+"Press 2 to Proceed to The Next Available Flight");
                        is_Selected=input.nextInt();
                        if(is_Selected==1) {
                            Selected_A_Flight=true;
                        }


        });
        if(!Selected_A_Flight){
            int exit = 0;
            System.out.println("You haven't selected a flight!"+"\n"+"Press 0 to Search again or -1 to quit");
            exit=input.nextInt();
            if(exit==0)Flight_Search(); // recursion technique
            else return;
        }
    }
    default void FlightSearchRepresentation(Flight flight){
        System.out.println("Flight Informations: ");
        System.out.println("Flight Number: "+flight.getFlightNumber());
        System.out.println("Departure Airport: "+flight.getDepartureAirport);
        System.out.println("Arrival Airport: "+flight.getArrivalAirport());
        System.out.println("Local Date: "+flight.getLocalDate());
        System.out.println("Local Time: "+flight.getLocalTime());

    }

}
