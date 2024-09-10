package org.example.e194;

import java.util.HashMap;
import java.util.Map;

public class E194Map {
    public static void main(String[] args) {

        HashMap<Integer, String> studentIDs = new HashMap<>();
        studentIDs.put(101, "John");
        studentIDs.put(102, "Emily");
        studentIDs.put(103, "Michael");
        studentIDs.put(104, "Sarah");
        studentIDs.put(105, "David");
        System.out.println("Student IDs:");
        for (Integer num : studentIDs.keySet()) {
            System.out.println("Student ID: " + num);
        }
        System.out.println(System.lineSeparator() + "Student Names:");
        for (String name : studentIDs.values()) {
            System.out.println("Student Name: " + name);
        }
        System.out.println(System.lineSeparator() + "Student Records:");

        for (Map.Entry<Integer, String> e: studentIDs.entrySet()){
            System.out.println("Student ID: " + e.getKey() + ", Student Name: " + e.getValue());
        }
    }
}
