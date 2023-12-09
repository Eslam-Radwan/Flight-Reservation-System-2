package edu.asu.mainPackage;

import java.util.Scanner;

public interface SeatSelection {
    public static void seatselection(Flight flightinfo, int numberOfPassengers, Booking booking){
        System.out.println("welcome to Seat selection:('+' sign means available seats)");
       int flightClass=flightinfo.getFlightClass();
        Seat[] economySeats = flightinfo.getEconomySeats();
        Seat[] buisinessSeats = flightinfo.getbuisinessSeats();
        Seat[] firstClassSeats = flightinfo.getfirstClassSeats();
       if(flightClass==0){
           char a='a';
           for(int i=0;i<6;i++){
               System.out.printf("%s ",a+i);
           }
           for(int i=0;i<5;i++){
               System.out.printf("%d ", i+1);
               for(int j=0;j<6;j++){
                   if(economySeats[i][j].getseatAvailability()==false){
                       System.out.print("- ");
                   }
                   else{
                       System.out.print("+ ");
                   }
               }
               System.out.println();
           }
           System.out.println("please enter your seat row number and column character");
           Scanner input = new Scanner(System.in);
           for(int i=0;i<numberOfPassengers;i++){
               System.out.print("please enter your seat:");
               String s = input.nextLine();
               flightinfo.setEconomySeatsAvailability((int)s.charAt(0), (int)s.charAt(0)-'a', 0);
               Seat seat = new Seat();
               booking.setTicketseat(i, seat);
           }
       }
        else if(flightClass==1){
            char a='a';
            for(int i=0;i<6;i++){
                System.out.printf("%s ",a+i);
            }
            for(int i=0;i<5;i++){
                System.out.printf("%d ", i+1);
                for(int j=0;j<6;j++){
                    if(buisinessSeats[i][j].getseatAvailability()==false){
                        System.out.print("- ");
                    }
                    else{
                        System.out.print("+ ");
                    }

                }
                System.out.println();
            }
           System.out.println("please enter your seat row number and column character");
           Scanner input = new Scanner(System.in);
           for(int i=0;i<numberOfPassengers;i++){
               System.out.print("please enter your seat:");
               String s = input.nextLine();
               flightinfo.setEconomySeatsAvailability((int)s.charAt(0), (int)s.charAt(0)-'a', 0);
               Seat seat = new Seat();
               booking.setTicketseat(i, seat);
           }
        }
        else if(flightClass==2){
            char a='a';
            for(int i=0;i<6;i++){
                System.out.printf("%s ",a+i);
            }
            for(int i=0;i<5;i++){
                System.out.printf("%d ", i+1);
                for(int j=0;j<6;j++){
                    if(firstClassSeats[i][j].getseatAvailability()==false){
                        System.out.print("- ");
                    }
                    else{
                        System.out.print("+ ");
                    }
                }
                System.out.println();
            }
           System.out.println("please enter your seat row number and column character");
           Scanner input = new Scanner(System.in);
           for(int i=0;i<numberOfPassengers;i++){
               System.out.print("please enter your seat:");
               String s = input.nextLine();
               flightinfo.setEconomySeatsAvailability((int)s.charAt(0), (int)s.charAt(0)-'a', 0);
               Seat seat = new Seat();
               booking.setTicketseat(i, seat);
           }
        }


    }
}