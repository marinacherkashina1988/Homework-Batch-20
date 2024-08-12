package org.example.e38;

import java.util.Scanner;

public class E38LogicalOperators {
    public static void main(String[] args) {

        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        System.out.println("Is it weekend? (true/false)");
        boolean isWeekend = input.nextBoolean();

        System.out.println("Are you available? (true/false)");
        boolean isAvailable = input.nextBoolean();

        if (isWeekend && isAvailable) {
            String subject = "Java";
            System.out.println("Today you will be learning " + subject);
        } else if (!isWeekend && isAvailable) {
            String subject = "manual testing";
            System.out.println("Today you will be learning " + subject);
        } else {
            String subject = "no subject";
            System.out.println("Today you will be learning " + subject);
        }
    }
}
