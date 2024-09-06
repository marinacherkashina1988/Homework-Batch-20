package org.example.e162;

public class E162MethodOverriding {

    public static class Animal {
        private String type;

        Animal(String type) {
            this.type = type;
        }

        public void eat() {
            System.out.println("I am an animal eating");
        }

        protected void sleep() {
            System.out.println("I am an animal sleeping");
        }

        void makeSound() {
            System.out.println("I am an animal making sound");
        }

        private void roam() {
            System.out.println("I am an animal roaming");
        }
    }

    public static class Cat extends Animal {

        public Cat(String type) {
            super(type);
        }

        @Override
        public void eat() {
            System.out.println("Cat eats");
        }

        @Override
        protected void sleep() {
            System.out.println(super.type + " sleeps a lot");
        }

        @Override
        void makeSound() {
            System.out.println("Cat makes a sound");
        }
    }

    public static class Kitten1 extends Cat {

        public Kitten1(String type) {
            super(type);
        }

        @Override
        public void eat() {
            System.out.println("kitten1 eats milk");
        }
    }

    public static class Kitten2 extends Cat {

        public Kitten2(String type) {
            super(type);
        }

        @Override
        public void eat() {
            System.out.println("kitten2 eats snacks");
        }
    }

    public static class Kitten3 extends Cat {

        public Kitten3(String type) {
            super(type);
        }

        @Override
        public void eat() {
            System.out.println("kitten3 eats everything");
        }
    }

    public static void main(String[] args) {

        Cat c = new Cat("Cat");
        Kitten1 k1 = new Kitten1("kitten1");
        Kitten2 k2 = new Kitten2("kitten2");
        Kitten3 k3 = new Kitten3("kitten3");

        Animal[] animals = new Animal[4];
        animals[0] = c;
        animals[1] = k1;
        animals[2] = k2;
        animals[3] = k3;

        for (Animal a : animals) {
            a.eat();
            a.sleep();
        }

        c.makeSound();

    }
}
