package com.company;

import java.util.ArrayList;
import java.util.Scanner;

import static com.company.Login.currentUser;

public class Spinning {


    static ArrayList<String> spinningbooked = new ArrayList<>(18);
    static ArrayList<String> spinningavailable = new ArrayList<>(9);

    static {
        spinningavailable.add("1a");
        spinningavailable.add("1b");
        spinningavailable.add("1c");
        spinningavailable.add("2a");
        spinningavailable.add("2b");
        spinningavailable.add("2c");
        spinningavailable.add("3a");
        spinningavailable.add("3b");
        spinningavailable.add("3c");
    }




    public static void spinning(){

        Scanner input = new Scanner(System.in);
        String response;
        String bookingstop = "Stopp";
        String passresponse;
        String str = "";






        do {
            System.out.printf("Welcome to book Spinning, if its correct enter Spinning again else exit whit Stopp %n");
            Scanner in = new Scanner(System.in);


            String spinning = "spinning";

            response = in.nextLine();

            if (response.equalsIgnoreCase(bookingstop)) {
                break;
            }



            if (response.equalsIgnoreCase(spinning) || response.equalsIgnoreCase(spinning)) {

                for (String yogaspots : spinningavailable) {
                    str += yogaspots+","; }

                System.out.println("Lediga platser: " + spinningavailable);
                // available choice after entry





            }

            if(spinningbooked.size() >= 18){
                System.out.println("Fully booked");
                break;


            }
            if(spinningbooked.contains(Login.currentUser.get(currentUser.size() - 1))) {
                System.out.println("Sorry, you've already booked a spot for this exercise.");
                break;


            }

            for (int counter = spinningbooked.size(); counter >= 0; counter--) {

                if (!spinningbooked.isEmpty()) {
                    if (spinningbooked.contains(spinningavailable.get(counter))) {
                        spinningavailable.remove(spinningavailable.get(counter));
                    }
                }

            }


            passresponse = input.nextLine();


            if (passresponse.equalsIgnoreCase(bookingstop)) {
                break;

            }

            // if entry booked error message
            if (spinningbooked.contains(passresponse)) {
                System.out.println("The entry is already booked.");


            }




            // Only passresponse that == yogaavalibe can be passed throug
            if(!spinningavailable.contains(passresponse)) {
                System.out.println("Enter a valid input." + spinningavailable);

            }




            else {
                spinningbooked.add(passresponse);
                spinningavailable.remove(passresponse);

                spinningbooked.add(Login.currentUser.get(currentUser.size() - 1));


                System.out.printf("Successful booking!%n");


            }


            if (response.equalsIgnoreCase(bookingstop)) {
                break;
            }



        }

        while(!response.equalsIgnoreCase(bookingstop) || !response.equalsIgnoreCase(bookingstop));




        System.out.println("Exiting Booking");



























    }






}
