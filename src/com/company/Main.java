package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        String textmenu = "Welcome to The Gym!\n1.Login\n2.Book a Exercise\n3.Register\n0.Exit" ;



        Scanner sc= new Scanner(System.in);


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
















































