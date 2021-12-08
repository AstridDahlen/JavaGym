package com.company;
import java.util.Scanner;
import static com.company.Register.addNewMember;

public class Login {

    public  Login(){
        System.out.println(addNewMember);
        Scanner sc= new Scanner(System.in);
        System.out.print("Login: Enter your personnumber 10 digits");
        String personNummer = sc.nextLine();
        if(addNewMember.contains(personNummer))
        {
            System.out.println("Welcome to your account " + " " + personNummer);

        }
        else
        {
            System.out.println("Unsucsessfull Login");
        }


    }


}
