package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Booking {
    // List to keep booking
    static ArrayList<String> yogaavailable = new ArrayList<>(8);
    static ArrayList<String> aerobicsavailable = new ArrayList<>(8);
    static ArrayList<String> spinningavailable = new ArrayList<>(8);

    public void booking() {



        String response;
        String bookingstop = "q";

        //  The available booking
        yogaavailable.add("1a");
        yogaavailable.add("2a");
        yogaavailable.add("3a");
        yogaavailable.add("1b");
        yogaavailable.add("2b");
        yogaavailable.add("3b");
        yogaavailable.add("1c");
        yogaavailable.add("2c");
        yogaavailable.add("3c");

        aerobicsavailable.add("1a");
        aerobicsavailable.add("2a");
        aerobicsavailable.add("3a");
        aerobicsavailable.add("1b");
        aerobicsavailable.add("2b");
        aerobicsavailable.add("3b");
        aerobicsavailable.add("1c");
        aerobicsavailable.add("2c");
        aerobicsavailable.add("3c");

        spinningavailable.add("1a");
        spinningavailable.add("2a");
        spinningavailable.add("3a");
        spinningavailable.add("1b");
        spinningavailable.add("2b");
        spinningavailable.add("3b");
        spinningavailable.add("1c");
        spinningavailable.add("2c");
        spinningavailable.add("3c");

        //  keep booking until stop
        do {
            System.out.printf("Welcome do you want to book Yoga, Areobics or Spinning? Type q for exit.%n");
            Scanner input = new Scanner(System.in);
            response = input.nextLine();



            if (response.equalsIgnoreCase("Yoga") || response.equalsIgnoreCase("Yoga")) {



                String passresponse;
                String stop = "q";


                // available choice after entry

                System.out.println("Enter your choice: end qith q");
                for (int counter = 0; counter < yogaavailable.size(); counter++) {
                    System.out.println(yogaavailable.get(counter));

                }


                passresponse = input.nextLine();
                    // if entry booked error message
                if (!yogaavailable.contains(passresponse) && !passresponse.equalsIgnoreCase(stop)) {
                    System.out.println("The entry is already booked.");
                    // if wrong entry error message
                }
                else if (!yogaavailable.contains(passresponse) && !passresponse.equalsIgnoreCase(stop)) {
                    System.out.println("Enter a number and a letter.");
                }
                // the entry chosen is removed
                else {
                    yogaavailable.remove(passresponse);

                    System.out.printf("Successful bookning!%n");
                    break;
                }
            }




            if (response.equalsIgnoreCase("Aerobics") || response.equalsIgnoreCase("Aerobicspass")) {

                String passresponse;
                String stop = "q";



                // se comments above the difference is the name but same code structure
                System.out.println("Enter your choice: end qith q");
                for (int counter = 0; counter < aerobicsavailable.size(); counter++) {
                    System.out.println(aerobicsavailable.get(counter));

                }


                passresponse = input.nextLine();
                // se comments above the difference is the name but same code structure
                if (!aerobicsavailable.contains(passresponse) && !passresponse.equalsIgnoreCase(stop)) {
                    System.out.println("The entry is already booked.");

                }
                // se comments above the difference is the name but same code structure
                else if (!aerobicsavailable.contains(passresponse) && !passresponse.equalsIgnoreCase(stop)) {
                    System.out.println("Enter a number and a letter.");
                }
                // se comments above the difference is the name but same code structure
                else {
                    aerobicsavailable.remove(passresponse);

                    System.out.printf("Successful bookning!%n");
                    break;
                }
            }


            if (response.equalsIgnoreCase("Spinning") || response.equalsIgnoreCase("Spinningpass")) {

                String passresponse;
                String stop = "q";



                // se comments above the difference is the name but same code structure
                System.out.println("Enter your choice: end qith q");
                for (int counter = 0; counter < spinningavailable.size(); counter++) {
                    System.out.println(spinningavailable.get(counter));

                }


                passresponse = input.nextLine();
                // se comments above the difference is the name but same code structure
                if (!spinningavailable.contains(passresponse) && !passresponse.equalsIgnoreCase(stop)) {
                    System.out.println("The entry is already booked.");
                    // se comments above the difference is the name but same code structure
                }
                else if (!spinningavailable.contains(passresponse) && !passresponse.equalsIgnoreCase(stop)) {
                    System.out.println("Enter a number and a letter.");
                }
                // se comments above the difference is the name but same code structure
                else {
                    spinningavailable.remove(passresponse);

                    System.out.printf("Successful bookning!%n");
                    break;
                }
            }


            else if (response.equalsIgnoreCase(bookingstop)) {
                System.out.println("Entry Booked!");

            }
        }


        while (!response.equalsIgnoreCase(bookingstop));

    }  }





