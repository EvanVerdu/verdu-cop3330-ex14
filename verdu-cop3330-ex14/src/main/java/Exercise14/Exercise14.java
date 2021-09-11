package Exercise14;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.Scanner;

public class Exercise14 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        String amount = scanner.nextLine();

        System.out.print("What is the state? ");
        String state = scanner.nextLine();

        double Amount = Double.parseDouble(amount);
        double Tax = 0;

        if ( state.equals("WI")) {

           System.out.println("The subtotal is $" + String.format("%.2f", Amount) + ".");
           Tax = (Amount*0.055);
           System.out.println("The tax is $" + String.format("%.2f", Tax) + ".");

           }

        System.out.print("The total is $" + String.format("%.2f", (Amount + Tax)) + ".");


    }

}
