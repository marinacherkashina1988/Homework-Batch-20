package org.example.e120;

public class E120Variables {

    // Declare 3 instance variables: year, school name, and batch number
    static int year;
    static String schoolName;
    static int batchNumber;

    public static void main(String[] args) {

        // Access variables from the main method and assign specific values to them
        // Print values of your variables in the specified format
        year = 2020;
        schoolName = "Syntax";
        batchNumber = 6;

        System.out.println("I am a student of batch " + batchNumber + " studying at " + schoolName + " in the year of " + year);
    }
}
