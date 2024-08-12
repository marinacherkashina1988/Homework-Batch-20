package org.example.e28;

public class E28SimpleCalculatorElseIf {
    public static void main(String[] args) {

        // Declare a variable for operator and assign a value
        String operator = "*";

        // Declare two variables for numbers and assign values
        int num1 = 10;
        int num2 = 5;
        int mul = num1 * num2;
        int result = mul;

        // Perform the corresponding arithmetic operation
        if (operator.equals("+")) {
            System.out.println("The sum is: " + result);
        } else if (operator.equals("-")) {
            System.out.println("The difference is: " + result);
        } else if (operator.equals("*")) {
            System.out.println("The product is: " + result);
        } else if (operator.equals("/")) {
            System.out.println("The quotient is: " + result);
        } else {
            System.out.println("Invalid operator" + result);
        }
    }
}
