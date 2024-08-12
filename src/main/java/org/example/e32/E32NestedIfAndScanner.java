package org.example.e32;

import java.util.Scanner;

public class E32NestedIfAndScanner {
    public static void main(String[] args) {

        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Print prompt for user to enter gender
        // Capture the gender input
        System.out.println("Please enter your gender: M or F");
        String gender = input.next();

        // Print prompt for user to enter age
        // Capture the age input
        System.out.println("Please enter your age");
        int age = input.nextInt();

        // Classify based on gender and age
        // If age is above 25
        //    If gender is "F", print "Woman"
        //    Otherwise, print "Man"
        // If age is 25 or below
        //    If gender is "F", print "Girl"
        //    Otherwise, print "Boy"
        if (age > 25) {
            if (gender.equalsIgnoreCase("F")) {
                System.out.println("Woman");
            } else if (gender.equalsIgnoreCase("M")) {
                System.out.println("Man");
            } else {
                System.out.println("Please enter the correct age and gender");
            }
        } else {
            if (age <= 25 && gender.equalsIgnoreCase("F")) {
                System.out.println("Girl");
            } else if (age <= 25 && gender.equalsIgnoreCase("M")) {
                System.out.println("Boy");
            } else {
                System.out.println("Please enter the correct age and gender");
            }
        }
    }
}
