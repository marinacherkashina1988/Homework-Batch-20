package org.example.e136;

public class E136AccessModifiers {

    private static void method1() {
        System.out.println("This is Private Method");
    }

    static void method2() {
        System.out.println("This is Default Method");
    }

    protected static void method3() {
        System.out.println("This is Protected Method");
    }

    public static void method4() {
        System.out.println("This is Public Method");
    }

    public static void main(String[] args) {

        method1();
        method2();
        method3();
        method4();
    }
}


