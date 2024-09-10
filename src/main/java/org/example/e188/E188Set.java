package org.example.e188;

import java.util.TreeSet;

public class E188Set {

    public static void main(String[] args) {

        TreeSet<String> countries = new TreeSet<>();
        countries.add("India");
        countries.add("Australia");
        countries.add("South Africa");
        countries.add("India");
        countries.add("America");
        countries.add("America");
        System.out.println(countries);
    }
}
