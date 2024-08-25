package org.example.e117;

public class E117JavaMethods {
    public static void main(String[] args) {

        // Call the sumEvenToX method with various arguments to test the method
        System.out.println(sumEvenToX(5));
    }

    // Create method sumEvenToX with an integer parameter (x)
    // Inside the method, calculate the sum of even integers from 1 to x
    // Return the calculated sum

    static int sumEvenToX(int x) {
        int sum = 0;
        for (int i = 0; i <= x; i += 2) {
            sum = sum + i;
        }
        return sum;
    }
}
