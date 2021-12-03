package com.company;

import java.util.ArrayList;
import java.util.Scanner;

import static com.company.Authentication.luhn_validering;
import static com.company.Authentication.printMessage;

public class Register {

    static ArrayList<String> addNewMember = new ArrayList<>();


    public Register() {



        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your personnummer 10 digits:");
        String personNummer = sc.nextLine();
        boolean personnummercheck = luhn_validering(personNummer);
        printMessage(personnummercheck);
        if(personnummercheck){
        addNewMember.add(personNummer);
        System.out.println("Sucsessfull registration" + addNewMember);
        new Membertype();
        }else{System.out.println("You have not been registered, personnumber not authenticated");

            }


            {





    }
















        }
        }



