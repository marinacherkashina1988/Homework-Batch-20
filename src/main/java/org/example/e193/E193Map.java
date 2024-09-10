package org.example.e193;

import java.util.HashMap;

public class E193Map {

    public static void main(String[] args) {

        HashMap<Integer, String> bookIds = new HashMap<>();
        bookIds.put(101, "The Catcher in the Rye");
        bookIds.put(102, "To Kill a Mockingbird");
        bookIds.put(103, "1984");
        bookIds.put(104, "The Great Gatsby");
        bookIds.put(105, "Moby Dick");

        System.out.println("Initial number of books in catalog: " + bookIds.size());
        System.out.println("Is the catalog empty? " + bookIds.isEmpty());
        System.out.println("Is book with ID 102 available? " + bookIds.containsKey(102));
        System.out.println("Is the book \"1984\" available? " + bookIds.containsValue("1984"));
        bookIds.remove(105);
        System.out.println("Updated catalog after removing ID 105:");
        bookIds.forEach((k, v) -> {System.out.println(k + ": " + v);});
        bookIds.clear();
        System.out.println("Is the catalog empty after clearing? " + bookIds.isEmpty());

    }
}
