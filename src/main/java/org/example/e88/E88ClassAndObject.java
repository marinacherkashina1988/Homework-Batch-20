package org.example.e88;

public class E88ClassAndObject {

    public static void main(String[] args) {

        // Create a class named 'Dog'
        // Declare String variables named 'breed', 'name', and 'color'
        // Declare methods named 'bark()', 'run()', and 'play()' that print messages in the specified format

        // Create the first object of the class 'Dog' with breed = "Husky", name = "AnyName", color = "AnyColor"
        Dog dog1 = new Dog();
        dog1.breed = "Husky";
        dog1.name = "Max";
        dog1.color = "Grey";

        // Create the second object of the class 'Dog' with breed = "Bulldog", name = "AnyName", color = "AnyColor"
        Dog dog2 = new Dog();
        dog2.breed = "Bulldog";
        dog2.name = "Rex";
        dog2.color = "Black";

        // Create the third object of the class 'Dog' with breed = "Labrador", name = "AnyName", color = "AnyColor"
        Dog dog3 = new Dog();
        dog3.breed = "Labrador";
        dog3.name = "Conon";
        dog3.color = "Brown";

        // Call the methods 'bark()', 'run()', and 'play()' for each object

        dog1.bark();
        dog1.run();
        dog1.play();

        dog2.bark();
        dog2.run();
        dog2.play();

        dog3.bark();
        dog3.run();
        dog3.play();

    }
}
