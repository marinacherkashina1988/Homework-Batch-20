package org.example.e192;

import java.util.TreeMap;

public class E192Map {
    public static void main(String[] args){

        TreeMap<String, String> productIDs = new TreeMap<>();
        productIDs.put("1 item", "apple");
        productIDs.put("2 item", "banana");
        productIDs.put("3 item", "pear");
        productIDs.put("4 item", "tomato");
        productIDs.put("5 item", "mango");
        productIDs.put("6 item", "kiwi");

        productIDs.forEach((k,v)->{System.out.println("Key is " + k + " and value is " + v);});

    }
}