package org.example.e190;

import java.util.LinkedHashMap;

public class E190Map {
    public static void main(String[] args) {

        LinkedHashMap<String, String> addressInfo = new LinkedHashMap<>();
        addressInfo.put("Street", "Patrick ST");
        addressInfo.put("Suite", "265");
        addressInfo.put("City", "Vienna");
        addressInfo.put("Zip", "22180");
        addressInfo.put("Country", "United States");

        System.out.println("Address Details:");
        for (String values: addressInfo.values()){
            System.out.println(values);
        }
    }
}
