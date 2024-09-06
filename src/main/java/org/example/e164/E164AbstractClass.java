package org.example.e164;

public class E164AbstractClass {

    public static abstract class Vehicle {
        abstract void startEngine();

        public void stopEngine() {
            System.out.println("Vehicle engine stopped");
        }
    }

    public static class Car extends Vehicle {
        public void startEngine(){
            System.out.println("Car engine started");
        }

        public void startEngine(String keyType){
            System.out.println("Car engine started with "+keyType);
        }
    }

    public static void main(String[] args) {

        Car c = new Car();
        c.startEngine();
        c.startEngine("a smart key");
        c.stopEngine();
    }
}


