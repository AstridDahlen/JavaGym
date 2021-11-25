package com.company;

public class Authentication {



    static boolean luhn_validering(String personNumber) {


           int insertNumber = personNumber.length() - 10;
           if (insertNumber < 0) {
            throw new IllegalArgumentException("Insert 10 numbers!");

        }
        personNumber = personNumber.substring(insertNumber, 10 + insertNumber);
        int sum = 0;
        for (int i = 0; i < personNumber.length(); i++) {
            char parse = personNumber.charAt(i);
            int number = parse - '0';
            int total;
            if (i % 2 != 0) {
                total = number * 1;
            } else {
                total = number * 2;
            }
            if (total > 9)
                total -= 9;
            sum += total;

        }
        return (sum % 10 == 0);

    }

    static void printMessage(boolean valid) {




        if (valid) {
            System.out.print("Valid!\r");



        } else {
            System.out.print("Invalid!");
        }
    }




}
