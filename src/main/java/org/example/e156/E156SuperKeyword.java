package org.example.e156;

public class E156SuperKeyword {

    public static class Animal {
        String sound = "Some generic animal sound";
    }

    public static class Dog extends Animal {
        String sound = "Bark";

        public void displaySound() {
            System.out.println(sound);
            System.out.println(super.sound);
        }
    }

    public static void main(String[] args) {

        Dog d = new Dog();
        d.displaySound();

    }
}
