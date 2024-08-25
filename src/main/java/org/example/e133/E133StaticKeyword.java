package org.example.e133;

public class E133StaticKeyword {

    static int countA(String s) {
        int result = 0;
        char letter;

        for (int i = 0; i < s.length(); i++) {
            letter = s.charAt(i);
            if (letter == 'a' || letter == 'A') {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countA("aaa"));
        System.out.println(countA("aaBBdf8k3AAadnklA"));
    }
}

