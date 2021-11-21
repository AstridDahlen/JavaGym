package com.company;
import java.util.HashMap;

import java.util.Scanner;
public class Register{




    HashMap<Integer,String > registerUser = new HashMap<>();




    public Register() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter personnumber 10 digits ");
        int personNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter password");
        String password = sc.nextLine();

        // Creates new entry in hashMap of user input
        registerUser.put(personNumber,password);

        System.out.println("New Gymuser " + personNumber + " succesfully registerd.");
        System.out.println("------------------------------------");
        System.out.println(registerUser);


    }



    public memberType(){

        Scanner sc= new Scanner(System.in);
        System.out.println("Välj ett av medlemskapen genom att ange antal månader du vill vara medlem:");
        System.out.println("1-2 Månader, Månadskostnad 400kr");
        System.out.println("3-6 Månader, Månadskostnad 350kr");
        System.out.println("7-12 Månader, Månadskostnad 300kr");
        System.out.println("12 och längre , Månadskostnad 250kr");
        int membership= sc.nextInt();

        if (membership <= 2){System.out.println("Du har valt " + membership +" månader din kostnad är 400 kr per månad din totalkostnad är "+ membership*400 + "kr");}
        else if (membership <=6){System.out.println("Du har valt " + membership + " månader din kostnad är 350 kr per månad din totalkostnad är "+ membership*350 + "kr");}
        else if (membership <=12){System.out.println("Du har valt " + membership + " månader din kostnad är 300 kr per månad din totalkostnad är "+ membership*300 + "kr");}
        else if (membership <=13){System.out.println("Du har valt " + membership + " månader din kostnad är 250 kr per månad din totalkostnad är "+ membership*250 + "kr");}

    }








}
