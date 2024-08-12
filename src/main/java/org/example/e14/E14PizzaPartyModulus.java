package org.example.e14;

public class E14PizzaPartyModulus {
    public static void main(String[] args) {

        // Declare the int variables and assign values
        int totalSlices = 13;
        int friends = 4;

        // Calculate slices per person
        int div = totalSlices / friends;
        int slicesPerPerson = div;
        int mod = totalSlices % slicesPerPerson;
        int leftoverSlices = mod;

        // Print the results
        System.out.println("Each person gets " + slicesPerPerson + " slices.");
        System.out.println("There are " + leftoverSlices + " slices left over.");
    }
}
