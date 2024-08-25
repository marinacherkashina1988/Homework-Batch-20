package org.example.e123;

public class E123Variables {

    // Declare instance variables to hold integer, String, double, boolean, and float values
    int myInt;
    String myString;
    double myDouble;
    boolean myBoolean;
    float myFloat;

    void printInfo() {
        System.out.println(myInt);
        System.out.println(myString);
        System.out.println(myDouble);
        System.out.println(myBoolean);
        System.out.println(myFloat);
    }

    public static void main(String[] args) {

        // Create an instance of the class
        // Access instance variables and print them without assigning any values
        // Print the default values of the instance variables
        E123Variables a = new E123Variables();
        a.printInfo();
    }
}
