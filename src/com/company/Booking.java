package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Booking {

    static ArrayList<String> yogaavailable = new ArrayList<>(8);
    static ArrayList<String> aerobicsavailable = new ArrayList<>(8);
    static ArrayList<String> spinningavailable = new ArrayList<>(8);

    public void booking() {



        String response;
        String bookingstop = "Stopp";


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


        do {
            System.out.printf("Välkommen, vill du boka ett yogapass, aerobicspass eller spinningpass? Skriv stopp för att avsluta.%n");
            Scanner input = new Scanner(System.in);
            response = input.nextLine();



            if (response.equalsIgnoreCase("Yoga") || response.equalsIgnoreCase("Yogapass")) {



                String passresponse;
                String stop = "Stopp";




                System.out.println("Välj plats eller skriv stopp för att avsluta:");
                for (int counter = 0; counter < yogaavailable.size(); counter++) {
                    System.out.println(yogaavailable.get(counter));

                }


                passresponse = input.nextLine();

                if (!yogaavailable.contains(passresponse) && !passresponse.equalsIgnoreCase(stop)) {
                    System.out.println("Tyvärr, platsen är redan upptagen.");

                }
                else if (!yogaavailable.contains(passresponse) && !passresponse.equalsIgnoreCase(stop)) {
                    System.out.println("Ange en giltig plats.");
                }

                else {
                    yogaavailable.remove(passresponse);

                    System.out.printf("Klart!%n");
                }
            }




            if (response.equalsIgnoreCase("Aerobics") || response.equalsIgnoreCase("Aerobicspass")) {

                String passresponse;
                String stop = "Stopp";




                System.out.println("Välj plats eller skriv stopp för att avsluta:");
                for (int counter = 0; counter < aerobicsavailable.size(); counter++) {
                    System.out.println(aerobicsavailable.get(counter));

                }


                passresponse = input.nextLine();

                if (!aerobicsavailable.contains(passresponse) && !passresponse.equalsIgnoreCase(stop)) {
                    System.out.println("Tyvärr, platsen är redan upptagen.");

                }
                else if (!aerobicsavailable.contains(passresponse) && !passresponse.equalsIgnoreCase(stop)) {
                    System.out.println("Ange en giltig plats.");
                }

                else {
                    aerobicsavailable.remove(passresponse);

                    System.out.printf("Klart!%n");
                }
            }


            if (response.equalsIgnoreCase("Spinning") || response.equalsIgnoreCase("Spinningpass")) {

                String passresponse;
                String stop = "Stopp";




                System.out.println("Välj plats eller skriv stopp för att avsluta:");
                for (int counter = 0; counter < spinningavailable.size(); counter++) {
                    System.out.println(spinningavailable.get(counter));

                }


                passresponse = input.nextLine();

                if (!spinningavailable.contains(passresponse) && !passresponse.equalsIgnoreCase(stop)) {
                    System.out.println("Tyvärr, platsen är redan upptagen.");

                }
                else if (!spinningavailable.contains(passresponse) && !passresponse.equalsIgnoreCase(stop)) {
                    System.out.println("Ange en giltig plats.");
                }

                else {
                    spinningavailable.remove(passresponse);

                    System.out.printf("Klart!%n");
                    break;
                }
            }


            else if (response.equalsIgnoreCase(bookingstop)) {
                System.out.println("Dina platser är bokade!");

            }
        }


        while (!response.equalsIgnoreCase(bookingstop));

    }  }





