package edu.asu.mainPackage;

import java.util.ArrayList;


public class WorkFlow implements UserWork, AdminWork, LoginMenu, LoadData, UploadData{

    public  void work()
    {
        ArrayList<Flight> Flights = new ArrayList<>();
        loadData();
        if(loginMenu() == 1){
            boolean gotToWork = userWork(Flights); // when gotToWork = 0 the program upload the data and close
            while(gotToWork){
                gotToWork = userWork(Flights);
            }
        }
        else{

            boolean gotToWork = adminWork(Flights); // when gotToWork = 0 the program upload the data and close
            while(gotToWork)
            {
                gotToWork = adminWork(Flights);
            }
        }
        uploadData();
    }




}
