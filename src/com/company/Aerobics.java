package com.company;

import java.util.ArrayList;
import java.util.Scanner;

import static com.company.Login.currentUser;

public class Aerobics {



    static ArrayList<String> aerobicsbooked = new ArrayList<>(18);
    static ArrayList<String> aerobicsavailable = new ArrayList<>(9);

    static {
        aerobicsavailable.add("1a");
        aerobicsavailable.add("1b");
        aerobicsavailable.add("1c");
        aerobicsavailable.add("2a");
        aerobicsavailable.add("2b");
        aerobicsavailable.add("2c");
        aerobicsavailable.add("3a");
        aerobicsavailable.add("3b");

        aerobicsavailable.add("3c");
    }





    public static void aerobics(){

        Scanner input = new Scanner(System.in);
        String response;
        String bookingstop = "Stopp";
        String passresponse;
        String str = "";







        do {
            System.out.printf("Welcome to book aerobics, if its correct enter aerobics again else exit whit Stopp %n");
            Scanner in = new Scanner(System.in);

            String aerobics = "aerobics";


            response = in.nextLine();

            if (response.equalsIgnoreCase(bookingstop)) {
                break;
            }



            if (response.equalsIgnoreCase(aerobics) || response.equalsIgnoreCase(aerobics)) {

                for (String aerobicsspot : aerobicsavailable) {
                    str += aerobicsspot+","; }

                System.out.println("Lediga platser: " + aerobicsavailable);
                // available choice after entry





            }

            if(aerobicsbooked.size() >= 18){
                System.out.println("Fully booked");
                break;


            }
            if(aerobicsbooked.contains(Login.currentUser.get(currentUser.size() - 1))) {
                System.out.println("Sorry, you've already booked a spot for this exercise.");
                break;


            }

            for (int counter = aerobicsbooked.size(); counter >= 0; counter--) {

                if (!aerobicsbooked.isEmpty()) {
                    if (aerobicsbooked.contains(aerobicsavailable.get(counter))) {
                        aerobicsavailable.remove(aerobicsavailable.get(counter));
                    }
                }

            }


            passresponse = input.nextLine();


            if (passresponse.equalsIgnoreCase(bookingstop)) {
                break;

            }

            // if entry booked error message
            if (aerobicsbooked.contains(passresponse)) {
                System.out.println("The entry is already booked.");


            }




            // Only passresponse that == yogaavalibe can be passed throug
            if(!aerobicsavailable.contains(passresponse)) {
                System.out.println("Enter a valid input." + aerobicsavailable);

            }




            else {
                aerobicsbooked.add(passresponse);
                aerobicsavailable.remove(passresponse);

                aerobicsbooked.add(Login.currentUser.get(currentUser.size() - 1));


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










