package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        //GUI  = new GUI();
        String textmenu = "Welcome to The Gym!\n1.Login\n2.Book a Exercise\n3.Register\n0.Exit" ;
        System.out.println(textmenu);


        Scanner sc= new Scanner(System.in);
        //int meny= sc.nextInt();

        while(true)
        {
          System.out.println(textmenu);
          int newmenu = sc.nextInt();

                while(newmenu!=0)
                    {
                            if(newmenu==1)
                            {
                                new Login();
                                break;
                            }
                            else if(newmenu==2)
                            {
                                new BookExercise();
                                break;
                            }
                            else if(newmenu==3)
                            {

                             new Authentication();
                             new Register();
                             new Membertype();
                             break;

                        }
                        else
                        {

                        }  



           }
                  }
        }


     }   
















































