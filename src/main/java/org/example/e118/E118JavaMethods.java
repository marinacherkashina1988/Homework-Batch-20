package org.example.e118;

public class E118JavaMethods {

    static String spaceOut(String s) {
        String space = "";
        for (int i = 0; i < s.length(); i++) {
            space += s.charAt(i) + " ";
        }
        return space;
    }

    public static void main(String[] args) {

        // Students will write the code here.
        System.out.println(spaceOut("hello"));
        System.out.println(spaceOut("technology"));
    }
}
