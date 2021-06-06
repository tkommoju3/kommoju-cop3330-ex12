/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tanushka Kommoju
 */

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {

        double principal, interestRate, years;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        principal = input.nextDouble();


        System.out.print("Enter the rate of interest: ");
        interestRate = input.nextDouble();


        System.out.print("Enter the number of years: ");
        years = input.nextDouble();

        double newInterest = interestRate / 100;
        double interest = principal * (1 + (newInterest * years));

        System.out.print("After " + years + " years at " + interestRate + "%, the investment will be worth $" + interest + ".");

    }
}



