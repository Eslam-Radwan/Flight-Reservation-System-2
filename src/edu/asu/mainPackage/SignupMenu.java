package edu.asu.mainPackage;

import java.util.Scanner;

public interface SignupMenu {
    default void signupMenu(ApplicationUser user){
        Scanner input = new Scanner(System.in);
        System.out.println("First Name: ");
        user.setFirstName(input.next());
        System.out.println("Last Name: ");
        user.setLastName(input.next());
        System.out.println("Username: ");
        user.setUsername(input.next());
        System.out.println("Email Address: ");
        user.setEmailAddress(input.next());
        System.out.println("Password: ");
        user.setPassword(input.next());
        user.setUser(true);
    }
}
