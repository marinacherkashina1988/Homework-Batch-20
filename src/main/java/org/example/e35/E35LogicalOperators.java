package org.example.e35;

import java.util.Scanner;

public class E35LogicalOperators {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Do you need a loan? (true/false)");
        boolean needsLoan = input.nextBoolean();

        if (needsLoan) {
            System.out.println("What is your credit score?");

            int creditScore = input.nextInt();

            if (creditScore < 600) {
                String eligibility = "Not eligible";
                System.out.println("The eligibility is " + eligibility);
            } else if (creditScore >= 600 && creditScore <= 700) {
                String eligibility = "Maybe eligible";
                System.out.println("The eligibility is " + eligibility);
            } else if (creditScore >= 701 && creditScore < 800) {
                String eligibility = "Eligible";
                System.out.println("The eligibility is " + eligibility);
            } else if (creditScore > 800) {
                String eligibility = "Definitely eligible";
                System.out.println("The eligibility is " + eligibility);
            }
        } else {
            String eligibility = "Unknown";
            System.out.println("The eligibility is " + eligibility);
        }
    }
}
