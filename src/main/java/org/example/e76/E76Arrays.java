package org.example.e76;

public class E76Arrays {
    public static void main(String[] args) {

        // Declare and initialize the 2D array with the given values
        double[][] a = {
                {1.4, 2.0, 3.3, 2},
                {4, 1.5, 6.1, 1},
                {1.2, 3.1, 4, 1.6}
        };
        // Use nested loops to iterate through the 2D array and double the value of each element
        // Use nested loops to iterate through the 2D array and print each value
        for (int i = 0; i < a.length; i++) {
            for (int m = 0; m < 4; m++) {
                a[i][m] = a[i][m] * 2;
                System.out.print(a[i][m] + " ");
            }
            System.out.println();
        }
    }
}
