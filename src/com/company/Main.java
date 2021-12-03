package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        String textmenu = "Welcome to The Gym!\n1.Login\n2.Book a Exercise\n3.Register\n0.Exit" ;
        Scanner sc= new Scanner(System.in);

        while(true)
        {
          System.out.println(textmenu);
          int meny = sc.nextInt();
                while(meny!=0)
                    {
                        if(meny==1)
                        {
                            new Login();
                            break;
                        }
                        else if(meny==2)
                        {
                            new BookExercise();
                            break;
                        }
                        else if(meny==3)
                        {
                            new Authentication();
                            new Register();
                            break;
                        }
                        else
                        {
                            System.out.println("Enter a digit between 1-3");
                        }

           }
        }
    }
}
















































