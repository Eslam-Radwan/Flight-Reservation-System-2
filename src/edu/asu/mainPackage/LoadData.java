package edu.asu.mainPackage;

import java.io.*;
import java.util.ArrayList;

public interface LoadData {
    default void loadData(){
        File users = new File("users.txt");
        File flights = new File("Flights.txt");
        try{
            ObjectInputStream userInputStream = new ObjectInputStream(new FileInputStream(users));
            WorkFlow.appUsers=(ArrayList<ApplicationUser>) userInputStream.readObject();
        }catch (ClassNotFoundException e) {
            System.out.println("File Not found");
            try {
                users.createNewFile();
            }catch(IOException exp){
                System.out.println(exp);
            }
        }catch (IOException e){
            System.out.println(e.toString());
        }

        try{
            ObjectOutputStream flightsOutputStream = new ObjectOutputStream(new FileOutputStream(flights));
            flightsOutputStream.writeObject(WorkFlow.Flights);
        }catch (IOException ioException){
            System.out.println(ioException.toString());
        }
    }
}
