package org.example.e196;

import java.util.*;

public class E196Map {
    public static void main(String[] args) {

        Map<String, List<String>> employees = new LinkedHashMap<>();

        employees.put("HR", Arrays.asList("Alice", "Bob"));
        employees.put("IT", Arrays.asList("Charlie", "David", "Eve"));
        employees.put("Finance", Arrays.asList("Frank", "Grace"));

        for (Map.Entry<String, List<String>> e : employees.entrySet()) {
            System.out.println("Department: " + e.getKey() + " Employees: " + e.getValue());
        }

        System.out.println(System.lineSeparator()+"All Departments:");
        for (String department: employees.keySet()){
            System.out.println(department);
        }

        System.out.println(System.lineSeparator()+"All Employees:");

        for(List<String> names:employees.values()){
            System.out.println(names);
        }
    }
}
