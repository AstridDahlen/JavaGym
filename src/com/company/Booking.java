package com.company;

import java.util.Scanner;

public class Booking {


    public static void booking() {

        System.out.printf("Welcome do you want to book Yoga, Aerobics or Spinning?  %n");

        Scanner input = new Scanner(System.in);
        String response = input.nextLine();
        String yoga = "yoga";
        String aerobics = "aerobics";
        String spinning = "spinning";

        while (true) {
            if (response.equalsIgnoreCase(yoga)) {
                Yoga.yoga();
                break;
            }
            if (response.equalsIgnoreCase(aerobics)) {
                Aerobics.aerobics();
                break;
            }
            else if (response.equalsIgnoreCase(spinning)) {

                Spinning.spinning();
                break;
            } else {
                System.out.println("Enter Yoga, Aerobics or Spinning");
                Booking.booking();
                break;


            }

        }
    }


}






