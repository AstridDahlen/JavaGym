package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Booking {
    // List to keep booking

    static ArrayList<String> yogaavailable = new ArrayList<>();
    static ArrayList<String> aerobicsavailable = new ArrayList<>();
    static ArrayList<String> spinningavailable = new ArrayList<>();

    public static void booking() {

        Scanner input = new Scanner(System.in);
        String booking = "[1a, 1b, 1c, 2a, 2b, 2c, 3a, 3b, 3c]" ;
        String response;


        while(true) {
            System.out.printf("Welcome do you want to book Yoga, Areobics or Spinning? %n");
            new Scanner(System.in);
            response = input.nextLine();


            if (response.equalsIgnoreCase("Yoga") || response.equalsIgnoreCase("Yoga")) {

                if(yogaavailable.size() >= 9){
                    System.out.println("Fully booked");
                    break;
                }

                String passresponse;

                System.out.println(booking);
                // available choice after entry

                System.out.println("Booked entrys" + " " + yogaavailable );
                passresponse = input.nextLine();
                    // if entry booked error message
                if (yogaavailable.contains(passresponse)) {
                    System.out.println("The entry is already booked.");

                }

                else {
                    yogaavailable.add(passresponse);

                    System.out.printf("Successful bookning!%n");
                    break;

                }

            }




            if (response.equalsIgnoreCase("Aerobics") || response.equalsIgnoreCase("Aerobicspass")) {


                  if(aerobicsavailable.size() >= 9)
                  {
                      System.out.println("Fully booked");
                      break;

                  }

                 String passresponse;
                System.out.println(booking);
                // available choice after entry

                System.out.println("Booked entrys" + " " + aerobicsavailable );



                passresponse = input.nextLine();
                // if entry booked error message
                if (aerobicsavailable.contains(passresponse)) {
                    System.out.println("The entry is already booked.");

                }

                else {
                    aerobicsavailable.add(passresponse);

                    System.out.printf("Successful bookning!%n");
                    break;

                }

            }



            if (response.equalsIgnoreCase("Spinning") || response.equalsIgnoreCase("Spinningpass")) {


                  if(spinningavailable.size() >= 9)
                  {
                          System.out.println("Fully booked");
                          break;
                  }


                String passresponse;


                System.out.println(booking);
                // available choice after entry

                System.out.println("Booked entrys" + " " + spinningavailable );



                passresponse = input.nextLine();
                // if entry booked error message
                if (spinningavailable.contains(passresponse)) {
                    System.out.println("The entry is already booked.");

                }

                else {
                    spinningavailable.add(passresponse);

                    System.out.printf("Successful bookning!%n");
                    break;

                }

            }

                System.out.println("Entry Booked!");
            break;


        }
    }
}





