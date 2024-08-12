package org.example.e80;

public class E80Arrays {
    public static void main(String[] args) {

        // Declare and initialize the 2D array with the given values
        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
        int negativeOdd = 0;

        // Use nested loops to iterate through the 2D array and count the elements that are both negative and odd
        for (int i = 0; i < a.length; i++) {

            for (int m = 0; m < a[i].length; m++) {
                if (a[i][m] < 0 && a[i][m] % 2 != 0) {
                    negativeOdd++;
                }
            }
        }
        System.out.println(negativeOdd);
        // Print the total count of elements that are both negative and odd
    }
}
