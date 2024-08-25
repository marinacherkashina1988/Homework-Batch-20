package org.example.e131;

public class E131StaticKeyword {

    static String thirdLetter(String s) {
        String word = "";
        for (int i = 0; i < s.length(); i += 3) {
            word += s.charAt(i);
        }
        return word;
    }

    public static void main(String[] args) {

        System.out.println(thirdLetter("hello there"));
        System.out.println(thirdLetter("technology"));
    }
}
