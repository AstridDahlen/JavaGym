package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import static com.company.Authentication.luhn_validering;
import static com.company.Authentication.printInprompt;

public class Register {
    // list for members
    static ArrayList<String> addNewMember = new ArrayList<>();


    public Register() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your personnummer 10 digits:");
        String personNummer = sc.nextLine();
        // if validation is valid add member in list and give member choice for membership
        boolean personnummercheck = luhn_validering(personNummer);
        printInprompt(personnummercheck);

        if(personnummercheck)
        {
            addNewMember.add(personNummer);
            System.out.println("Sucsessfull registration" + addNewMember);
            new Membertype();
        }
        // error message if not authenticated
        else
        {
            System.out.println("You have not been registered, personnumber not authenticated, Pleas try again");
        }


            {





    }
















        }
        }



