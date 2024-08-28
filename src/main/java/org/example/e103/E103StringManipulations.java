package org.example.e103;

import java.util.Scanner;

public class E103StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner inp = new Scanner(System.in);
        System.out.println("In:");

        // Prompt the user to input a string
        String s = inp.nextLine();

        // Use a for loop to iterate through the string and print each character separated by spaces on the same line
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
            if (i<s.length()-1){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
