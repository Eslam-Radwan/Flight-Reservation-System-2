package edu.asu.mainPackage;

import java.util.ArrayList;


public class WorkFlow implements UserWork, AdminWork, LoginMenu{

    public  void work()
    {
        ArrayList<Flight> Flights = new ArrayList<>();
//        ArrayList<AccountInfo> Accounts = new ArrayList<>();
//        LoadData.loadFlights(Flights);
//        LoadData.loadAccountsData(Accounts);

        if(loginMenu() == 1){
            while(true){
                userWork(Flights);
            }
        }
        else{
            while(true) {
                adminWork(Flights);
            }
        }



    }




}
