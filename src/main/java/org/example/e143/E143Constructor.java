package org.example.e143;

public class E143Constructor {

    public static class Car {
        private String make;
        private String model;
        private int numberOfDoors;
        private int topSpeed;
        private double price;

        public Car(String make, String model, int numberOfDoors, int topSpeed, double price) {
            this.make=make;
            this.model=model;
            this.numberOfDoors=numberOfDoors;
            this.topSpeed=topSpeed;
            this.price=price;
        }

        public Car(String make, String model, int topSpeed, double price) {
            this.make=make;
            this.model=model;
            numberOfDoors = 4;
            this.topSpeed=topSpeed;
            this.price=price;
        }

        public Car(int numberOfDoors, int topSpeed, double price) {
            make = "unknown";
            model = "unknown";
            this.numberOfDoors=numberOfDoors;
            this.topSpeed=topSpeed;
            this.price=price;

        }

        public Car(String make, String model, int numberOfDoors) {
            this.make=make;
            this.model=model;
            this.numberOfDoors=numberOfDoors;
            topSpeed = 90;
            price = 0;
        }

        public void display() {
            System.out.println(make + " " + model + " " + numberOfDoors + " " + topSpeed + " " + price);
        }
    }

    public static void main(String[] args) {

        Car obj1 = new Car("Toyota", "Prius", 4, 120, 30000.0);
        obj1.display();

        Car obj2 = new Car("Toyota", "Prius", 120, 30000.0);
        obj2.display();

        Car obj3 = new Car(4, 120, 30000.0);
        obj3.display();

        Car obj4 = new Car("Toyota", "Prius", 4);
        obj4.display();
    }
}


