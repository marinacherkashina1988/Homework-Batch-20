package org.example.e119;

public class E119JavaMethods {

    static String censorLetter(String s, char c1) {
        String str = new String(s);
        str = str.replace(c1, '*');
        return str;
    }

    public static void main(String[] args) {

        // Students will write the code here.
        System.out.println(censorLetter("computer science", 'e'));
        System.out.println(censorLetter("trick or treat",'t'));
    }
}
