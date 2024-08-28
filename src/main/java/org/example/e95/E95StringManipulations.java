package org.example.e95;

import java.util.Scanner;

public class E95StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner (System.in);

        // Prompt the user to input a string value
        // Read the input string
        String fruit = input.nextLine();

        // Extract the first 3 letters using the substring() method
        String letters = fruit.substring(0,3);

        // Print the result in the specified format
        System.out.println("Please enter a word: The first 3 letters of "+fruit+" is "+letters);
    }
}
