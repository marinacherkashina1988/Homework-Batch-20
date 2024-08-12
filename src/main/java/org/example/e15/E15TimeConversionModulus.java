package org.example.e15;

public class E15TimeConversionModulus {
    public static void main(String[] args) {

        // Declare the int variable and assign a value
        int totalMinutes = 125;

        // Calculate hours and minutes
        int div = totalMinutes / 60;
        int hours = div;

        int mod = totalMinutes % 60;
        int minutes = mod;

        // Print the results
        System.out.println(totalMinutes + " minutes is equal to " + hours + " hours and " + minutes + " minutes.");
    }
}
