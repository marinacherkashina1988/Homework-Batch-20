package org.example.e179;

import java.util.LinkedList;

public class E179List {

    public static void main(String[] args) {

        LinkedList<Integer> integers = new LinkedList<>();

        for (int i = 50; i <= 100; i++) {
            integers.add(i);
        }

        integers.removeIf(i -> i % 3 != 0);
        System.out.println(integers);
    }
}
