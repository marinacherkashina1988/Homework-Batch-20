package org.example.e145;

public class E145ThisKeyword {

    public static class Dog {
        private String dogName;
        private double dogWeight;
        private static String dogBreed = "Mutt";

        public Dog(String dogName, double dogWeight) {
            this.dogName = dogName;
            this.dogWeight = dogWeight;
        }

        public String displayDetails() {
            String s = dogName + " " + dogBreed + " " + dogWeight;
            return s;
        }
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("Tarzan", 50.0);
        Dog d2 = new Dog("Lucy", 10.0);
        System.out.print(d1.displayDetails()+ System.lineSeparator()+d2.displayDetails()+ System.lineSeparator());
    }
}
