package com.company;

import java.util.ArrayList;
import java.util.Scanner;

import static com.company.Register.addNewMember;


public class Login {
    static ArrayList<String> currentUser = new ArrayList<>();


    public ArrayList<String> displayCurrentUser() {
        return Login.currentUser;
    }

    public  Login(){
        // printing list to see that member is in list
        //System.out.println(addNewMember);
        Scanner sc= new Scanner(System.in);
        System.out.print("Login: Enter your personnumber 10 digits");
        String personNummer = sc.nextLine();

        // if list contains member login and choose exercise
        if(addNewMember.contains(personNummer))
        {
            System.out.println("Welcome to your account " + " " + personNummer);
            currentUser.add(personNummer);

            // when logged in run booking
           Booking.booking();


        }
        else
        // error message if not member
        {
            System.out.println("Unsuccessful Login");
        }

    }

}
