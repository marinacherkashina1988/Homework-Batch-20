package org.example.e43;

import java.util.Scanner;

public class E43SwitchStatment {
    public static void main(String[] args) {

        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your electricity usage in kWh");
        int usage = input.nextInt();

        double rate;
        double bill;

        if (usage >= 1 && usage <= 100) {
            rate = 0.12;
        } else if (usage >= 101 && usage <= 200) {
            rate = 0.15;
        } else if (usage >= 201 && usage <= 300) {
            rate = 0.20;
        } else if (usage > 300) {
            rate = 0.25;
        } else {
            System.out.println("Invalid usage entered");
            return;
        }

        bill = usage * rate;
        System.out.println("Your electricity bill is $" + bill);

    }
}
