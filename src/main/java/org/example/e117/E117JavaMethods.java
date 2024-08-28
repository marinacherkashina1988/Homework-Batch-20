package org.example.e117;

public class E117JavaMethods {
    public static void main(String[] args) {
        // Call the sumEvenToX method with various arguments to test the method
        System.out.println("sumEvenToX(5) ==> " + sumEvenToX(5));
        System.out.println("sumEvenToX(8) ==> " + sumEvenToX(8));
    }

    // Create method sumEvenToX with an integer parameter (x)
    // Inside the method, calculate the sum of even integers from 1 to x
    // Return the calculated sum
    public static int sumEvenToX(int x) {
        int sum = 0;
        for (int i = 0; i <= x; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
