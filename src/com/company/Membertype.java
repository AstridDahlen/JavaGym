package com.company;
import java.util.Scanner;
public class Membertype {


    public Membertype(){

        Scanner sc= new Scanner(System.in);
        System.out.println("Choose a membership:");
        System.out.println("1-2 Months, Monthly cost 400kr");
        System.out.println("3-6 Months, Monthly cost 350kr");
        System.out.println("7-12 Months, Monthly cost 300kr");
        System.out.println("12 or Months , Monthly cost 250kr");
        int membership= sc.nextInt();

        if (membership <= 2){System.out.println("You have choosen " + membership +" and your monthly billing is 400 kr and your total cost is "+ membership*400 + "kr");}
        else if (membership <=6){System.out.println("You have choosen " + membership + " and your monthly billing is 350 kr and your total cost is "+ membership*350 + "kr");}
        else if (membership <=12){System.out.println("You have choosen " + membership + " and your monthly billing is 300 kr and your total cost is "+ membership*300 + "kr");}
        else if (membership <=13){System.out.println("You have choosen " + membership + " and your monthly billing is 250 kr and your total cost is "+ membership*250 + "kr");}

    }




}
