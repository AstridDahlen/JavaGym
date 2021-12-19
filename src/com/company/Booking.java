package com.company;

import java.util.ArrayList;
import java.util.Scanner;

import static com.company.Login.currentUser;

public class Booking {
    // List to keep booking

    static ArrayList<String> yogabooked = new ArrayList<>(18);
    static ArrayList<String> yogaavailable = new ArrayList<>(9);
    static ArrayList<String> aerobicsavailable = new ArrayList<>(18);
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



    public static void booking() {

        Scanner input = new Scanner(System.in);
        String response;
        String bookingstop = "Stopp";
        String passresponse;
        String str = "";







        do {
            System.out.printf("Welcome do you want to book Yoga, Areobics or Spinning? Write stopp to exit %n");
            Scanner in = new Scanner(System.in);
            response = in.nextLine();

            if (response.equalsIgnoreCase(bookingstop)) {
                break;
            }



            if (response.equalsIgnoreCase("Yoga") || response.equalsIgnoreCase("Yoga")) {


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

            for (String yogaspots : yogaavailable) {
                str += yogaspots+","; }

            System.out.println("Lediga platser: " + yogaavailable);
            // available choice after entry

            passresponse = input.nextLine();


            if (passresponse.equalsIgnoreCase(bookingstop)) {
                break;

            }

            // if entry booked error message
            if (yogabooked.contains(passresponse)) {
                System.out.println("The entry is already booked.");


            }





            if(!str.contains(passresponse)) {
                System.out.println("Enter a valid input.");

            }




            else {
                yogabooked.add(passresponse);
                yogaavailable.remove(passresponse);

                yogabooked.add(Login.currentUser.get(currentUser.size() - 1));


                System.out.printf("Successful booking!%n");


            }







            /*if (response.equalsIgnoreCase("Aerobics") || response.equalsIgnoreCase("Aerobicspass")) {


                  if(aerobicsavailable.size() >= 9)
                  {
                      System.out.println("Fully booked");


                  }


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


                }

            }



            if (response.equalsIgnoreCase("Spinning") || response.equalsIgnoreCase("Spinningpass")) {


                  if(spinningavailable.size() >= 9)
                  {
                          System.out.println("Fully booked");

                  }





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


                }
*/
        }

        while(!response.equalsIgnoreCase(bookingstop) || !response.equalsIgnoreCase(bookingstop));




        System.out.println("Done!");




    }

}







