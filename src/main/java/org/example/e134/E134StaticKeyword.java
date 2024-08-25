package org.example.e134;

public class E134StaticKeyword {

    static int countVowels(String s) {
        int count = 0;
        char letter;

        for (int i = 0; i < s.length(); i++) {
            letter = s.charAt(i);
            if (letter == 'a' || letter == 'o' || letter == 'e' || letter == 'i' || letter == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(countVowels("obama"));
        System.out.println(countVowels("happy friday! i love weekends"));
    }
}

