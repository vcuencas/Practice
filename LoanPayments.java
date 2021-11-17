package src;

import java.util.Scanner;

public class LoanPayments {
    public static void main(String[] args) {
        // variables
        Scanner input = new Scanner(System.in);
        double annualInterest, monthlyInterest, loanAmount,
                monthlyPayment, totalPayment;
        int years;

        // obtain yearly interest rate
        System.out.print("Enter the yearly interest rate, such as 8.5: ");
        annualInterest = input.nextDouble();

        // obtain number of years
        System.out.print("Enter the number of years as an integer: ");
        years = input.nextInt();

        // obtain total loan amount
        System.out.print("Enter the total loan amount, such as 1200.35: ");
        loanAmount = input.nextDouble();

        // calculate monthly interest
        monthlyInterest = annualInterest / 1200;

        // calculate monthly payment
        monthlyPayment = (loanAmount * monthlyInterest)/
                (1 - 1/ Math.pow(1 + monthlyInterest, years * 12));

        // calculate total payment
        totalPayment = monthlyPayment * years * 12;

        // display monthly and total payments
        System.out.println("The monthly payment is " + (int)(monthlyPayment * 100) / 100.0);
        System.out.println("The total payment is " +  (int)(totalPayment * 100) / 100.0);
    }
}
