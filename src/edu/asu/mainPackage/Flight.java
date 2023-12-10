package edu.asu.mainPackage;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
public class Flight {
    private int flightNumber;
    private String departureAirport;
    private String arrivalAirport;
    private LocalTime departureTime;
    private LocalTime arrivalTime;
    private LocalDate departureDate;
    private double[] seatPrice;
    private seats[][] economySeats;
    private seats[][] businessClass;
    private seats[][] firstClass;
    private int[] numberOfAvailableSeat ;
public Flight(){
    seatPrice=new double[3];
    numberOfAvailableSeat = new int[]{30, 30, 30};
    economySeats =new seats[5][6];
    businessClass =new seats[5][6];
    firstClass=new seats[5][6];
}
    public int getNumberOfAvailableSeat(int classType){
        return this.numberOfAvailableSeat[classType];
    }

    public boolean equal(Flight flight){
        if(this.departureAirport.equals(flight.departureAirport) && this.arrivalAirport.equals(flight.arrivalAirport))
            return true;
        else return false;
    }

      ArrayList<String>  passenger = new ArrayList<>();

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public void setNumberOfAvailableSeats(int numberOfAvailableSeats) {
        this.numberOfAvailableSeats = numberOfAvailableSeats;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public int getNumberOfAvailableSeats() {
        return numberOfAvailableSeats;
    }

    public void setPassenger(ArrayList<String> passenger) {
        this.passenger = passenger;
    }
}
