package com.company;

import java.util.ArrayList;
import java.util.Scanner;

import static com.company.Login.currentUser;




public class Yoga {
    // List to keep booking

    static ArrayList<String> yogabooked = new ArrayList<>(18);
    static ArrayList<String> yogaavailable = new ArrayList<>(9);

    static ArrayList<String> spinningavailable = new ArrayList<>(18);
    static {
        yogaavailable.add("1a");
        yogaavailable.add("1b");
        yogaavailable.add("1c");
        yogaavailable.add("2a");
        yogaavailable.add("2b");
        yogaavailable.add("2c");
        yogaavailable.add("3a");
        yogaavailable.add("3b");
        yogaavailable.add("3c");




    }



    public static void yoga(){

        Scanner input = new Scanner(System.in);
        String response;
        String bookingstop = "Stopp";
        String passresponse;
        String str = "";







        do {
            System.out.printf("Welcome to book Yoga, if its correct enter yoga again else exit whit Stopp %n");
            Scanner in = new Scanner(System.in);
            String yoga = "yoga";



            response = in.nextLine();

            if (response.equalsIgnoreCase(bookingstop)) {
                break;
            }



            if (response.equalsIgnoreCase(yoga) || response.equalsIgnoreCase(yoga)) {

                for (String yogaspots : yogaavailable) {
                    str += yogaspots+","; }

                System.out.println("Lediga platser: " + yogaavailable);
                // available choice after entry





            }

            if(yogabooked.size() >= 18){
                System.out.println("Fully booked");
                break;


            }
            if(yogabooked.contains(Login.currentUser.get(currentUser.size() - 1))) {
                System.out.println("Sorry, you've already booked a spot for this exercise.");
                break;


            }

            for (int counter = yogabooked.size(); counter >= 0; counter--) {

                if (!yogabooked.isEmpty()) {
                    if (yogabooked.contains(yogaavailable.get(counter))) {
                        yogaavailable.remove(yogaavailable.get(counter));
                    }
                }

            }


            passresponse = input.nextLine();


            if (passresponse.equalsIgnoreCase(bookingstop)) {
                break;

            }

            // if entry booked error message
            if (yogabooked.contains(passresponse)) {
                System.out.println("The entry is already booked.");


            }




            // Only passresponse that == yogaavalibe can be passed throug
            if(!yogaavailable.contains(passresponse)) {
                System.out.println("Enter a valid input." + yogaavailable);

            }




            else {
                yogabooked.add(passresponse);
                yogaavailable.remove(passresponse);

                yogabooked.add(Login.currentUser.get(currentUser.size() - 1));


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











