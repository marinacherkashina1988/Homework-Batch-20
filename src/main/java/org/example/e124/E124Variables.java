package org.example.e124;

public class E124Variables {

    // Declare a static variable at the class level
    static String ss = "Welcome To Syntax Technologies";

    static void printInfo() {
        System.out.println(ss);
    }

    public static void main(String[] args) {

        // Access and print the static variable using three different methods
        // 1. By calling directly
        printInfo();

        // 2. By using the class name
        E124Variables.printInfo();

        // 3. By creating an object of the class
        E124Variables object = new E124Variables();
        object.printInfo();
    }
}
