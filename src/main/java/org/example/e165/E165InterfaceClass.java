package org.example.e165;

public class E165InterfaceClass {

    public interface ElectronicDevice {
        public void turnOn();

        public void turnOff();
    }

    public static class Smartphone implements ElectronicDevice {
        @Override
        public void turnOn() {
            System.out.println("Smartphone is turning on");
        }

        @Override
        public void turnOff() {
            System.out.println("Smartphone is turning off");
        }
    }

    public static class Laptop implements ElectronicDevice {
        @Override
        public void turnOn() {
            System.out.println("Laptop is turning on");
        }

        @Override
        public void turnOff() {
            System.out.println("Laptop is turning off");
        }
    }

    public static void main(String[] args) {

        Smartphone s = new Smartphone();
        s.turnOn();
        s.turnOff();

        Laptop l = new Laptop();
        l.turnOn();
        l.turnOff();

    }
}