package org.example.e140;

public class E140AccessModifiers {

    static String maxLength(String[] array) {
        String longestWord = array[0];
        for (String word : array) {
            if (longestWord.length() < word.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {
        System.out.println(maxLength(new String[]{"hard", "class", "this is long", "dog"}));
    }
}
