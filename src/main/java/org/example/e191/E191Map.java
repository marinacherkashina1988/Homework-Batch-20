package org.example.e191;

import java.util.LinkedHashMap;

public class E191Map {

    public static void main(String[] args) {

        LinkedHashMap<String, Double> products = new LinkedHashMap<>();
        products.put("Laptop", 1200.99);
        products.put("Smartphone", 799.99);
        products.put("Tablet", 499.99);
        products.put("Smartwatch", 199.99);
        products.put("Headphones", 149.99);

        System.out.println("Product Catalog:");
        products.forEach((k,v)->{System.out.println(k + ": $"+v);});
    }
}
