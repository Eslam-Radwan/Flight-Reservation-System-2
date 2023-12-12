package edu.asu.mainPackage;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Callable;

public interface FlightSearch {
    default Booking flightSearch(){
        Booking booking;
        Flight Seleceted_Flight = new Flight();

        boolean Selected_A_Flight = false;
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
        for(Flight flights:Flights){
            if(Seleceted_Flight.equals(flights) && flights.getNumberOfAvailableSeat(SeatClass) >= NumberOfSeats){
                int Choice = 0;
                FlightSearchRepresentation(flights);
                System.out.println("----------------------------------------------------");
                System.out.println("Press 1 to select the current flight");
                System.out.println("Press 2 to show the next available flight");
                Choice=input.nextInt();
                while (Choice != 1 && Choice != 2){
                    System.out.println("Invalid Choice!!");
                    System.out.println("Press 1 to select the current flight");
                    System.out.println("Press 2 to show the next available flight");
                    Choice=input.nextInt();
                }
                if(Choice == 1){
                    Selected_A_Flight = true;
                    Seleceted_Flight = flights;
                    booking = new Booking(100,flights,NumberOfSeats,SeatClass);
                    //BookingProcess(Seleceted_Flight,NumberOfSeats,SeatClass); comment to be deleted
                    break;
                }
            }
        }
        if(!Selected_A_Flight){
            int exit = 0;
            System.out.println("You haven't selected a flight!");
            System.out.println("Press 0 to search again");
            System.out.println("Press -1 to Exit");
            exit=input.nextInt();
            while(exit!=0&&exit!=-1){
                System.out.println("Invalid Choice!!");
                System.out.println("Press 0 to search again");
                System.out.println("Press -1 to Exit");
                exit=input.nextInt();
            }
            if(exit == 0)flightSearch(Flights); // recursion technique
            //else return;
        }
        return booking;
    }
    private void FlightSearchRepresentation(Flight flight){
        System.out.println("Flight Informations: ");
        System.out.println("Flight Number: "+flight.getFlightNumber());
        System.out.println("Departure Airport: "+flight.getDepartureAirport());
        System.out.println("Arrival Airport: "+flight.getArrivalAirport());
        System.out.println("Departure Date: "+flight.getDepartureDate());
    }

}
