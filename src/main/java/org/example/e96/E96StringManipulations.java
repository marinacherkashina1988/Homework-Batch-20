package org.example.e96;

import java.util.Scanner;

public class E96StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner (System.in);

        // Prompt the user to input a programming language
        System.out.println("Please enter a programming language:");

        // Read the input string
        String language = input.nextLine();

        if (language.contains("Java")) {
            System.out.println("Java is a programming language");
        } else if (language.contains("C")) {
            System.out.println("C is a procedural programming language");
        } else if (language.contains("C++")) {
            System.out.println("C++ is a middle-level programming language");
        } else {
            System.out.println("Doesn't match any programming language");
        }
    }
}
