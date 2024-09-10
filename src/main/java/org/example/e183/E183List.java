package org.example.e183;

import java.util.LinkedList;

public class E183List {

    public static void main(String[] args) {

        LinkedList<Integer> monthlySales = new LinkedList<>();
        monthlySales.add(11100);
        monthlySales.add(12200);
        monthlySales.add(13300);
        monthlySales.add(14400);
        monthlySales.add(15500);
        monthlySales.add(16600);

        int sum = 0;
        for (Integer sale:monthlySales){
            sum+=sale;
        }
        System.out.println("Total sales for the year: "+sum);
    }
}