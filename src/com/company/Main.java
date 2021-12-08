package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        String textmenu = "Welcome to The Gym!\n1.Login\n2.Register\n0.Exit" ;
        Scanner sc= new Scanner(System.in);


        while(true)
        {
          System.out.println(textmenu);
          int meny = sc.nextInt();
          if(meny==0){
              System.out.println("See you soon at the gym!");
              System.exit(1);
          }
                while(meny!=0)
                    {
                     if(meny==1)
                        {

                           new Login();
                           new Booking().booking();
                           
                           break;

                            
                        }

                        

                        else if(meny==2)
                        {
                            new Authentication();
                            new Register();
                            break;
                        }




             }
        }
    }
}  
















































