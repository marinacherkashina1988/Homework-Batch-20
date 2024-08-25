package org.example.e115;

public class E115JavaMethods {
    public static void main(String[] args) {

        // Call the convertToUpper method and print the result
        String s = convertToUpper("test");
        System.out.println(s);
    }

    // Create method convertToUpper with a string parameter
    // Inside the method, convert the string to uppercase using toUpperCase method
    // Return the new uppercase string
    static String convertToUpper(String word) {
        return word.toUpperCase();
    }
}
