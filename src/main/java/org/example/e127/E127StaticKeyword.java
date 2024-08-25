package org.example.e127;

public class E127StaticKeyword {

    // Non-static method that prints a message
    // Static method that prints a message

    String nonStaticSentence;
    static String staticSentence;

    void printInfo() {
        System.out.println(nonStaticSentence);
    }

    static void printStatic() {
        System.out.println(staticSentence);
    }

    // Main method to execute both methods
    public static void main(String[] args) {

        // Create an instance of the class to call the non-static method
        E127StaticKeyword ob = new E127StaticKeyword();

        // Call non-static method
        ob.nonStaticSentence = "Programming is amazing.";
        ob.printInfo();

        // Call the static method directly using the class name
        // Call static method
        E127StaticKeyword.staticSentence = "Java is awesome.";
        E127StaticKeyword.printStatic();
    }
}
