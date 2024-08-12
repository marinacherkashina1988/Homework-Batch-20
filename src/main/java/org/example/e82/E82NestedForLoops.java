package org.example.e82;

public class E82NestedForLoops {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given pattern values
        String[][] pattern = {
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"}
        };

        for (int i = 0; i < pattern.length; i++) {

            for (int m = 0; m < pattern[i].length; m++) {
                System.out.print(pattern[i][m] + " ");
            }
            System.out.println();
        }
        // Use nested loops to iterate through the 2D array and print the pattern
    }
}
