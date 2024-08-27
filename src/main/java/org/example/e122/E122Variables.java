package org.example.e122;

public class E122Variables {

    // Declare 3 instance variables: name of the countryName, capital, and populationSize
        String countryName;
        String capital;
        int populationSize;

        // Create a method to display values of instance variables
        public void display() {
            System.out.println("The capital of " + countryName + " is " + capital + " and population is " + populationSize);
        }

    public static void main(String[] args) {
        // Create 2 instances of the class
        // Assign values to variables for the first instance
        // Execute the method to display values for the first instance
        // Assign values to variables for the second instance
        // Execute the method to display values for the second instance

        E122Variables obj1 = new E122Variables();
        obj1.countryName = "USA";
        obj1.capital = "Washington DC";
        obj1.populationSize = 330000000;
        obj1.display();

        E122Variables obj2 = new E122Variables();
        obj2.countryName = "Kazakhstan";
        obj2.capital = "Astana";
        obj2.populationSize = 18500000;
        obj2.display();
    }
}
