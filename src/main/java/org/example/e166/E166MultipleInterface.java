package org.example.e166;

public class E166MultipleInterface {

    interface Controllable{
        public void turnOn();
    }

    interface Configurable{
        public void configure();
    }

    public static class SmartHomeDevice implements Controllable, Configurable {
        @Override
        public void turnOn() {
            System.out.println("Turning on Smart Home Device");
        }

        @Override
        public void configure() {
            System.out.println("Configuring Smart Home Device settings");
        }
    }

    public static void main(String[] args) {

        SmartHomeDevice smart = new SmartHomeDevice();
        smart.turnOn();
        smart.configure();
    }
}

