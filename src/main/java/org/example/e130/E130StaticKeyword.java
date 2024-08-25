package org.example.e130;

public class E130StaticKeyword {

    static void printInfo(int[] numbers) {
        int result = 0;
        for (int n : numbers) {
            if (n % 2 == 0) {
                System.out.print(n / 2+ " ");
            } else if (n % 2 != 0) {
                System.out.print(n * 10+ " ");
            }
        }
    }

    public static void main(String[] args) {
        printInfo(new int[]{20, 2, 3, 4, 5});
    }
}
