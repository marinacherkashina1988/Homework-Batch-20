package org.example.e153;

public class E153SuperKeyword {

    public static class Vehicle {
        public Vehicle (){
            System.out.println("This is the Vehicle constructor");
        }
    }

    public static class Car extends Vehicle{
        public Car () {
            super();
        }
    }

    public static void main(String[] args) {

        Car c = new Car ();
    }
}
