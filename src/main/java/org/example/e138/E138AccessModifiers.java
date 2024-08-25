package org.example.e138;

public class E138AccessModifiers {

    public static void main(String[] args) {

        AnotherClass ob = new AnotherClass();
        ob.modifier1();
        ob.modifier2();
        ob.modifyer3();

    }
}

class AnotherClass {
    void modifier1() {
        System.out.println("default");
    }

    protected void modifier2() {
        System.out.println("protected");
    }

    public void modifyer3() {
        System.out.println("public");
    }
}
