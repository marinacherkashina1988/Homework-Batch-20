package org.example.e149;

public class E149Inheritance {

    public static class Vehicle {

         String make;
         int year;

        public Vehicle(String make, int year) {
            this.make = make;
            this.year = year;
        }

        public void displayInfo() {
            System.out.println("Vehicle: " + make + ", Year: " + year);
        }
    }

    public static class Car extends Vehicle {
        String model;

        public Car(String make, int year, String model) {
            super(make, year);
            this.model = model;
        }

        public void displayCarInfo() {
            displayInfo();
            System.out.println("Model: " + model);
        }
    }

    public static void main(String[] args) {

        Car c = new Car("Toyota", 2020, "Corolla");
        c.displayCarInfo();

    }
}
