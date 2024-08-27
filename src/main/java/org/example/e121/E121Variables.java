package org.example.e121;

import com.sun.tools.javac.Main;

public class E121Variables {
    // Declare 3 instance variables: integer, double, and char
    int intValue;
    double doubleValue;
    char charValue;

    public void printInfo(){
        System.out.println(intValue);
        System.out.println(doubleValue);
        System.out.println(charValue);
    }

    public static void main(String[] args) {

        // Create 2 instances of the class
        // Assign values to variables for the first instance
        // Print values of the first instance
        // Assign values to variables for the second instance
        // Print values of the second instance

        E121Variables first = new E121Variables();
        first.intValue = 10;
        first.doubleValue = 10.23;
        first.charValue = 'a';
        first.printInfo();

        E121Variables second = new E121Variables();
        second.intValue = 100;
        second.doubleValue = 100.23;
        second.charValue = 's';
        second.printInfo();
    }
}
