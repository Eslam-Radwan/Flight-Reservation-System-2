package edu.asu.mainPackage;

import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

import static edu.asu.mainPackage.WorkFlow.Flights;

public class Admin extends ApplicationUser{
    Scanner input = new Scanner(System.in);

//    public Admin(ApplicationUser admin){
//        this.setFirstName(admin.getFirstName());
//        this.setLastName(admin.getLastName());
//        this.setPassword(admin.getPassword());
//        this.setEmailAddress(admin.getEmailAddress());
//        this.setFirstName(admin.getFirstName());
//        this.setUser(false);
//    }

    public static Flight addFlight() {
        Flight flight = new FLight();
        System.out.print("Flight Number: ");
        int flightNumber = input.nextInt();
        System.out.print("Departure Airport: ");
        String departureAirport = input.next();
        System.out.print("Arrival Airport: ");
        String arrivalAirport = input.next();
        System.out.print("Departure Date(YY MM DD): ");
        int Year = input.nextInt();
        int Month = input.nextInt();
        int Day = input.nextInt();
        DefinedDate departureDate = new DefinedDate(Year,Month,Day);
        System.out.print("Departure Time(HH MM): ");
        int Hours = input.nextInt();
        int Minutes = input.nextInt();
        LocalTime departureTime = LocalTime.of(Hours,Minutes);
        System.out.print("Arrival Time(HH MM): ");
        Hours = input.nextInt();
        Minutes = input.nextInt();
        LocalTime arrivalTime = LocalTime.of(Hours,Minutes);



        flight.setflightNumber(flightNumber);
        flight.setdepartureAirport(departureAirport);
        flight.setarrivalAirport(arrivalAirport);
        flight.setdepartureDate(departureDate);
        flight.setdepartureTime(departureTime);
        flight.setarrivalTime(arrivalTime);

        return flight;

    }



    public static void updateFlight(){
        displayFlights();

        System.out.print("choose the number of flight: ");
        int numberOfFlight = input.nextInt();
        dislpayFlightInfo(Flights[numberOfFlight]);

        System.out.print("what do you want to edit: ");
        int propertyToEdit = input.nextInt();

        if(propertyToEdit == 1) {
            System.out.print("Entre the new flight number: ");
            int newFlightNumber = input.nextInt();
            Flight[numberOfFlight].setflightNumber(newFlightNumber);
        }
        if(propertyToEdit == 2) {
            System.out.print("Entre the new departure airport: ");
            String newDepartureAirport = input.next();
            Flight[numberOfFlight].setdepartureAirport(newDepartureAirport);
        }
        if(propertyToEdit == 3) {
            System.out.print("Entre the new arrival airport: ");
            String newArrivalAirport = input.next();
            Flight[numberOfFlight].setarrivalAirport(newArrivalAirport);
        }
        if(propertyToEdit == 4) {
            System.out.print("Entre the new departure date(YY MM DD): ");
            int Year = input.nextInt();
            int Month = input.nextInt();
            int Day = input.nextInt();
            DefinedDate newDepartureDate = new DefinedDate(Year,Month,Day);
            Flight[numberOfFlight].setdepartureDate(newDepartureDate);
        }
        if(propertyToEdit == 5) {
            System.out.print("Entre the new departure time(HH MM): ");
            int Hours = input.nextInt();
            int Minutes = input.nextInt();
            LocalTime newDepartureTime = LocalTime.of(Hours,Minutes);
            Flight[numberOfFlight].setdepartureTime(newDepartureTime);
        }
        if(propertyToEdit == 6) {
            System.out.print("Entre the new arrival time(HH MM): ");
            int Hours = input.nextInt();
            int Minutes = input.nextInt();
            LocalTime newArrivalTime = LocalTime.of(Hours,Minutes);
            Flight[numberOfFlight].setdepartureTime(newArrivalTime);
        }


    }

    public static void deleteFlight(ArrayList<Flight> Flights) {
        displayFlights();

        System.out.print("choose the number of flight: ");
        int numberOfFlight = input.nextInt();
        Flights[numberOfFlight].delete(); //if there is a delete method in arraylist
    }



    public static void setSeatAvailability(ArrayList<Flight> Flights) {
        displayFlights();

        System.out.print("choose the number of flight: ");
        int numberOfFlight = input.nextInt();

        displaySeats(Flights[numberOfFlight]);

        System.out.println("Select the row and column you want to edit(eg. 4B,3C): ");
        int row = input.nextInt();
        char column = input.next().charAt(0);
        changeSeatAvailability(row,column,Flights[numberOfFlight]);
    }




}

