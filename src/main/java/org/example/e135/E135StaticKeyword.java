package org.example.e135;

public class E135StaticKeyword {

    static String surround(String s, String search_term) {
        String newString = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.contains(search_term)) {
                newString = s.replaceAll(search_term, "(" + search_term + ")");
            }
        }
        return newString;
    }

    public static void main(String[] args) {

        System.out.println(surround("abcabcabc", "c"));
        System.out.println(surround("technology", "o"));
    }
}

