package org.example.e184;

import java.util.ArrayList;
import java.util.List;

public class E184List {

    public static String removeCountriesStartingWithA(List<String> countries) {
        countries.removeIf(x -> x.startsWith("A"));
        return countries.toString();
    }

    public static void main(String[] args) {

        List<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("Argentina");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");

        removeCountriesStartingWithA(countries);
        System.out.println(countries);
    }
}
