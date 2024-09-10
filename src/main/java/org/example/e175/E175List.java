package org.example.e175;

import java.util.ArrayList;

public class E175List {
    public static void main(String[] args) {

        ArrayList<Integer> quantity = new ArrayList<>();

        ArrayList <Integer> productA = new ArrayList<>();
        productA.add(111);
        productA.add(111);
        productA.add(111);

        ArrayList <Integer> productB = new ArrayList<>();
        productB.add(999);
        productB.add(999);
        productB.add(999);

        quantity.addAll(productA);
        quantity.addAll(productB);

        for (int q : quantity){
            System.out.println(q);
        }
    }
}
