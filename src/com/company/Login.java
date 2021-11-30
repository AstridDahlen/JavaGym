package com.company;

import java.util.ArrayList;
import java.util.Scanner;
public class Login {



    public  Login(){
        ArrayList<String> addNewMember = new ArrayList<>();
                // kan inte testa förrens listan funkar som den ska
        Scanner sc= new Scanner(System.in);
        System.out.print("Login: Enter your personnumber 10 digits");
        String personNummer = sc.nextLine();
        if(addNewMember.contains(personNummer))
        { System.out.println("inloggad");   }


    }









}
