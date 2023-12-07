package edu.asu.mainPackage;

import java.util.ArrayList;
import java.util.Scanner;

public interface User_Class_Interface {
    String username;
    String Email;

    ArrayList<Flight> Available_Flights;  //All Of The Flights in the Database

    default void Flight_Search(){
        Flight Seleceted_Flight = new Flight();

        boolean Selected_A_Flight=false;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Desired Destination: ");
        Seleceted_Flight.setDestination(input.next());

        System.out.println("Enter your Desired Departure Location: ");
        Seleceted_Flight.setDepartureAirport(input.next());

        System.out.println("Enter your Desired Travel Date: ");
        Seleceted_Flight.setDepartureTime(input.next());

     /* Override equals method in Flight Class
    as Follows :
     public boolean equals(Object obj){
        Flight Another_Flight = (Flight) obj;
      if(Another_Flight.Destination == this.Destination
           && Another_Flight.DepartureAirport== this.DepartureAirport
           && Another_Flight.DepartureTime==this.DepartureTime)
           return true;
        else return false;
      }
     */
        Available_Flights.stream().filter(flights -> (Seleceted_Flight.equals(flights))).forEach( flight -> {
                        int is_Selected=0;
                        System.out.println("Flight Number : "+flights.getFlightNumber());
                        System.out.println("Press 1 to Select Flight"+"\n"+"Press 2 to Proceed to The Next Available Flight");
                        is_Selected=input.nextInt();
                        if(is_Selected==1){
                            Selected_A_Flight=true;
                            Seat_Select(Seleceted_Flight);// Pass the flight that the user selected as a parameter to the seat selection method
                        }

        });
        if(!Selected_A_Flight){
            int exit = 0;
            System.out.println("You haven't selected a flight!"+"\n"+"Press 0 to Search again or -1 to quit");
            exit=input.nextInt();
            if(exit==0)Flight_Search();
            else return;
        }
    }
}
