package org.example.e144;

public class E144Constructor {

    public static class StoreProduct {
        private String label;
        private double price;
        private String category;
        private boolean hasExpiration;
        private int stock;

        public StoreProduct(String label, double price, String category, boolean hasExpiration, int stock) {
            this.label = label;
            this.price = price;
            this.category = category;
            this.hasExpiration = hasExpiration;
            this.stock = stock;
        }

        public StoreProduct(String label, double price, int stock) {
            this.label = label;
            this.price = price;
            category = "misc";
            hasExpiration = false;
            this.stock = stock;
        }

        public StoreProduct(String label, double price) {
            this.label = label;
            this.price = price;
            category = "misc";
            hasExpiration = false;
            stock = 0;
        }

        public String display() {
            String s = label + " " + price + " " + category + " " + hasExpiration + " " + stock;
            return s;
        }
    }

    public static void main(String[] args) {

        StoreProduct obj1 = new StoreProduct("Eggs", 3.0, "Produce", true, 10);
        StoreProduct obj2 = new StoreProduct("Paper Towels", 2.0, "misc", false, 24);
        StoreProduct obj3 = new StoreProduct("Paper Towels", 2.0, "misc", false, 0);
        System.out.print(obj1.display()+"\n"+obj2.display()+"\n"+obj3.display());
    }
}
