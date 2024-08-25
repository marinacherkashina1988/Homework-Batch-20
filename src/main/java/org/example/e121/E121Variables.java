package org.example.e121;

public class E121Variables {

    // Declare 3 instance variables: integer, double, and char
    int num1;
    double num2;
    char letter;

    void printInfo(){
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(letter);
    }

    public static void main(String[] args) {

        // Create 2 instances of the class
        // Assign values to variables for the first instance
        // Print values of the first instance
        // Assign values to variables for the second instance
        // Print values of the second instance

        E121Variables first = new E121Variables();
        first.num1 = 10;
        first.num2 = 10.23;
        first.letter = 'a';
        first.printInfo();

        E121Variables second = new E121Variables();
        second.num1 = 100;
        second.num2 = 100.23;
        second.letter = 's';
        second.printInfo();
    }
}
