package org.example.e84;

public class E84NestedForLoops {
    public static void main(String[] args) {
        // Declare and initialize the 2D array to store the multiplication table values
        int[][] table = new int[5][10];

        // Use nested loops to fill the 2D array with multiplication table values
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                table[i][j] = (i + 1 + 5) * (j + 1);
            }
        }
        // Use nested loops to iterate through the 2D array and print the pattern
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
