package org.example.e114;

public class E114JavaMethods {
    public static void main(String[] args) {

        // Call the add method with arguments that add up to 30
        int addResult = add(20, 10);
        System.out.println("Addition " + addResult);

        // Call the multiply method with arguments that multiply to 30
        int multiplyResults = multiply(3, 10);
        System.out.println("Multiplication " + multiplyResults);

        // Call the subtract method with arguments that subtract to 20
        int subtractResults = subtract(30, 10);
        System.out.println("Subtraction " + subtractResults);
    }

    // Create method multiply with two integer parameters and a print statement to display the result
    static int multiply(int a, int b) {
        return a * b;
    }

    // Create method add with two integer parameters and a print statement to display the result
    static int add(int c, int d) {
        return c + d;
    }

    // Create method subtract with two integer parameters and a print statement to display the result
    static int subtract(int e, int f) {
        return e - f;
    }
}
