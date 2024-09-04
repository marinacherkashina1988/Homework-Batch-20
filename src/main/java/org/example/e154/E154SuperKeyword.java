package org.example.e154;

public class E154SuperKeyword {

    public static class Appliance{
        public Appliance(){
            System.out.println("Appliance Constructor without argument");
        }
        public Appliance(int wattage){
            System.out.println("Wattage: " + wattage);
        }
    }

    public static class WashingMachine extends Appliance{
        public WashingMachine (){
            System.out.println("WashingMachine Constructor without argument");
        }

        public WashingMachine (int wattage, int capacity){
            super(wattage);
            System.out.println("Capacity: " + capacity);
        }
    }

    public static void main(String[] args) {

        WashingMachine obj = new WashingMachine();
        WashingMachine obj1 = new WashingMachine(500, 7);
    }
}
