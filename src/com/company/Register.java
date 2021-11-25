package com.company;

import java.util.Scanner;

import static com.company.Authentication.luhn_validering;
import static com.company.Authentication.printMessage;

public class Register {


    Scanner sc = new Scanner(System.in);

    public Register() {

        sc = new Scanner(System.in);
        System.out.print("Enter your personnummer 10 digits:");
        String personNummer = sc.nextLine();
        boolean personnummercheck = luhn_validering(personNummer);
        printMessage(personnummercheck);


    }












}
