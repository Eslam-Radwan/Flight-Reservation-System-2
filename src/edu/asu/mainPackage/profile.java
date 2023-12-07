package edu.asu.mainPackage;

public interface profile {
    default void displayUserData(Person user){
        System.out.println("user name "+ user.getUserName());
        System.out.println("email "+ user.getEmailAddress());
    }
    default void displayBookingInfo(Booking book){
        System.out.println("flight "+ book.getFlightNumber());
        System.out.println("booking status "+ book.getBookingStatus());
        System.out.println("seat number "+ book.getSeatNumber());
    }
    default void displayPassnegersInfo(Passenger[] passengers){
    for(passenger passenger:passengers){
        System.out.println("passenger first name "+ passenger.getFirstName());
        System.out.println("passenger last name "+ passenger.getLastName());
        System.out.println("phone "+ passenger.getPhoneNumber());
        System.out.println("email "+ passenger.getEmailAddress());

    }
    }
    default void displayTicketInfo(Ticket ticket){
        System.out.println("ticket number  "+ ticket.getTicketNumber());
        System.out.println("ticket fare  "+ ticket.getTicketFare());
        System.out.println("ticket status  "+ ticket.getTicketStatus());

    }


}
