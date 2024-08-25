package org.example.e137;

public class E137AccessModifiers {

    public static String name;
    private static String city;
    static String nameOfTheSchool;
    protected static int batchNumber;

    static void printInfo() {
        System.out.println("My name is " + name + " and I live in " + city + ". I study at " + nameOfTheSchool + " in batch " + batchNumber);
    }

    public static void main(String[] args) {

        name = "John";
        city = "Miami";
        nameOfTheSchool = "Syntax";
        batchNumber = 9;
        printInfo();

    }
}

