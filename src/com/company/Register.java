package com.company;

import java.util.ArrayList;
import java.util.Scanner;

import static com.company.Authentication.luhn_validering;
import static com.company.Authentication.printMessage;

public class Register {




    public Register() {

        ArrayList<String> addNewMember = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your personnummer 10 digits:");
        String personNummer = sc.nextLine();
        boolean personnummercheck = luhn_validering(personNummer);
        // problem med att personnummer läggs till i listan fast invalid
        printMessage(personnummercheck);
        addNewMember.add(personNummer);
        System.out.println(addNewMember);

        





    }





















}
