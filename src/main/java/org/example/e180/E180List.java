package org.example.e180;

import java.util.Collections;
import java.util.LinkedList;

public class E180List {
    public static void main(String[] args) {

        LinkedList<Integer> employeeAge = new LinkedList<>();
        employeeAge.add(18);
        employeeAge.add(30);
        employeeAge.add(81);
        employeeAge.add(35);
        employeeAge.add(40);
        employeeAge.add(45);
        employeeAge.add(69);
        employeeAge.add(50);
        employeeAge.add(60);
        employeeAge.add(55);

        employeeAge.removeIf(x -> x < 25 || x > 60);

        Collections.sort(employeeAge);
        System.out.println("Remaining ages: " + employeeAge);

        int sum = 0;
        double average = 0;
        for (Integer e : employeeAge) {
            sum += e;
            average = sum / employeeAge.size();
        }
        System.out.println("Average age: " + average);
    }
}
