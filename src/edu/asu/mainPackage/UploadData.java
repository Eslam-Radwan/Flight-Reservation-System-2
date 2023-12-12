package edu.asu.mainPackage;

import java.io.*;

public interface UploadData {
    default void uploadData(){
        File users = new File("users.txt");
        File flights = new File("Flights.txt");
        try{
            ObjectOutputStream userOutputStream = new ObjectOutputStream(new FileOutputStream(users));
            userOutputStream.writeObject(WorkFlow.appUsers);
        }catch (IOException ioException){
            System.out.println(ioException.toString());
        }

        try{
            ObjectOutputStream flightsOutputStream = new ObjectOutputStream(new FileOutputStream(flights));
            flightsOutputStream.writeObject(WorkFlow.Flights);
        }catch (IOException ioException){
            System.out.println(ioException.toString());
        }

    }
}
