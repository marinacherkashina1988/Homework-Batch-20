package org.example.e98;

public class E98StringManipulations {
    public static void main(String[] args) {
        // Create a String variable named 'given' and assign the value "Hello Syntax friends" to it
        String given = "Hello Syntax friends";

        // Manipulate the string to create a new string "Welcome Syntax family"
        given = given.substring(0,13).concat("family").replace("Hello", "Welcome");

        // Print the new string
        System.out.println(given);
    }
}
