package org.example.e176;


import java.util.ArrayList;

public class E176List {
    public static void main(String[] args) {

        ArrayList<Integer> productIDs = new ArrayList<>();
        productIDs.add(111);
        productIDs.add(222);
        productIDs.add(333);
        productIDs.add(444);
        productIDs.add(555);
        productIDs.add(666);

        System.out.println(productIDs);
        productIDs.removeAll(productIDs);
        System.out.println(productIDs);
    }
}
