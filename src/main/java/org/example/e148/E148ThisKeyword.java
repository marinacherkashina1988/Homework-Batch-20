package org.example.e148;

public class E148ThisKeyword {

    public static class ShoppingStore {
        private String item;
        private double price;
        private int quantity;

        public ShoppingStore(String item, double price, int quantity) {
            this.item = item;
            this.price = price;
            this.quantity = quantity;
        }

        public void itemTotalPrice() {
            double itemTotalPrice = 0;
            itemTotalPrice = price * quantity;
            System.out.println(item + " Total Value " + itemTotalPrice);
        }
    }

    public static void main(String[] args) {
        ShoppingStore obj1 = new ShoppingStore("Blanket", 49.99, 2);
        obj1.itemTotalPrice();
        double obj1totalPrice;
        obj1totalPrice = 99.98;
        ShoppingStore obj2 = new ShoppingStore("Mattress", 219.59, 2);
        obj2.itemTotalPrice();
        double obj2totalPrice;
        obj2totalPrice = 439.18;

        double totalSum = obj1totalPrice+obj2totalPrice;
        System.out.println("You purchased "+totalSum+" Today");

    }
}
   