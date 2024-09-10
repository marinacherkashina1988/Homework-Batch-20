package org.example.e195;

import java.util.*;

public class E195Map {

    public static void main(String[] args) {

        Map<String, List<String>> subjects = new LinkedHashMap<>();
        List<String> names1 = new ArrayList<>();
        names1.add("Alice");
        names1.add("Bob");

        List<String> names2 = new ArrayList<>();
        names2.add("Charlie");
        names2.add("David");

        List<String> names3 = new ArrayList<>();
        names3.add("Eve");
        names3.add("Frank");

        subjects.put("Mathematics", names1);
        subjects.put("Science", names2);
        subjects.put("History", names3);

        for(Map.Entry<String, List<String>> e: subjects.entrySet()){
            System.out.println("Subject: " + e.getKey() + " Students: " + e.getValue());
        }
    }
}
