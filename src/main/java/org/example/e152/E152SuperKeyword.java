package org.example.e152;

public class E152SuperKeyword {

    public static class Building {
        private String location;

        public Building (String location){
            this.location = location;
            System.out.println(location);
        }

        public Building(){
            System.out.println("Building Constructor");
        }
    }

    public static class House extends Building{

        public House(String location){
            super(location);
        }
    }

    public static void main(String[] args) {

            House h = new House ("Vienna");

    }
}

