package com.company;
public class Authentication {
// Authentication we assume that members are not older than 100 years
    // we only use digits and no hyphen between numbers
     static boolean luhn_validering(String personNumber) {

           int insertNumber = personNumber.length() - 10;

           if (insertNumber < 0)
           {

               System.out.println("Insert 10 numbers!");
               //if not 10 numbers run register again
               new Register();

           }

        personNumber = personNumber.substring(insertNumber, 10 + insertNumber);
        int sum = 0;
        for (int i = 0; i < personNumber.length(); i++)
        {
            char parse = personNumber.charAt(i);
            int number = parse - '0';
            int total;

            if (i % 2 != 0)
            {
                total = number * 1;
            }
            else
            {
                total = number * 2;
            }
            if (total > 9)
                total -= 9;
            sum += total;

        }
        return (sum % 10 == 0);

    }
// print for correct validation
    static void printInprompt(boolean correct) {


        if (correct) {
            System.out.print("Authenticated!");


        } else {
            System.out.print("Not Authenticated!");


        }
    }
}
