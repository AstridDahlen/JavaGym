package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        Scanner sc= new Scanner(System.in);
        System.out.println(" Welcome to The Gym!");
        System.out.println("1.Login");
        System.out.println("2.Book a Exercise");
        System.out.println("3.Register");
        int meny= sc.nextInt();

        if (meny==1){
            System.out.println("Login Entry");
            new Login();
        } else if(meny ==2){
            System.out.println("Booking entry");
        }else if (meny==3){
            System.out.println("Register entry");
            new Authentication();
            new Register();

        }// felhantering om inte en siffra felmeddelande








    }
}
