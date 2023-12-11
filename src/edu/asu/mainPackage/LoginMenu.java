package edu.asu.mainPackage;

import java.util.Scanner;

public interface LoginMenu {
    default int loginMenu()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Username: ");
        String username = input.next();
        System.out.println("Password: ");
        String password = input.next();
        if(username.equals("user")){
            return 1;
        }
        else{
            return 0;
        }
    }
}
