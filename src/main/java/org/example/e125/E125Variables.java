package org.example.e125;

public class E125Variables {

    // Declare a static variable at the class level to hold an integer value
    static int number;

    public static void printInfo() {
        System.out.println(number);
    }

    public static void main(String[] args) {

        // Access the static variable in the main method and assign a value to it
        number=200;

        // Create an object of the class
        // Access the static variable in a non-static way using the object and assign a value of 200
        E125Variables object = new E125Variables();
        object.number = 200;

        // Print the static variable using the class name
        E125Variables.printInfo();

        // Print the static variable using the object instance
        object.printInfo();
    }
}
