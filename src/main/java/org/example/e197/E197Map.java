package org.example.e197;

import java.util.LinkedHashMap;
import java.util.Map;

public class E197Map {

    public static class Dog {
        private String name;
        private String breed;
        private int age;

        public Dog(String name, String breed, int age) {
            this.name = name;
            this.breed = breed;
            this.age = age;
        }

        public String toString() {
            return "Dog{name='" + name + "', breed='" + breed + "', age=" + age + "}";
        }
    }

    public static void main(String[] args) {

        Map<Integer, Dog> dogs = new LinkedHashMap<>();

        Dog dog1 = new Dog("Max", "Labrador", 5);
        Dog dog2 = new Dog("Bella", "Beagle", 3);
        Dog dog3 = new Dog("Rocky", "Bulldog", 4);

        dogs.put(1, dog1);
        dogs.put(2, dog2);
        dogs.put(3, dog3);

        for(Map.Entry<Integer, Dog> e: dogs.entrySet()){
            System.out.println("Dog ID: "+e.getKey()+", Details: "+e.getValue());
        }
    }
}

