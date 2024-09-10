package org.example.e182;

import java.util.LinkedList;

public class E182List {

    public static boolean isPrime(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        LinkedList<Integer> primeNumbers = new LinkedList<>();

        for (int i = 2; i < 100; i++) {
            if (isPrime(i)){
                primeNumbers.add(i);
            }
        }
        System.out.println(primeNumbers);
    }
}


