package org.example.e40;

import java.util.Scanner;

public class E40SwitchClass {
    public static void main(String[] args) {

        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name of the instructor");
        String instructorName = input.next();

        switch (instructorName) {
            case "Asghar":
                String responsibility = "Will take care of Java Assignment";
                System.out.println(responsibility);
                break;
            case "Moazzam":
                responsibility = "Will take care of SDLC Assignment";
                System.out.println(responsibility);
                break;
            case "Weqas":
                responsibility = "Will take care of Selenium Assignment";
                System.out.println(responsibility);
                break;
            case "Asel":
                responsibility = "Will take care of every Assignment";
                System.out.println(responsibility);
                break;
            default:
                responsibility = "Invalid instructor selected";
                System.out.println(responsibility);
                break;
        }
    }
}
