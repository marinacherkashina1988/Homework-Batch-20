package org.example.e177;

import java.util.ArrayList;
import java.util.Scanner;

public class E177List {
    public static void main(String[] args) {

        ArrayList<String> chatMessages = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            chatMessages.add(input.nextLine());
        }

//checking the array backwards doesn't effect th indexes and they don't move.
        String message = "";
        for (int i = chatMessages.size() - 1; i >= 0; i -= 2) {
            chatMessages.remove(i);
        }
        System.out.println("Remaining messages:");

        for (int i = 0; i < chatMessages.size(); i++) {
            message = chatMessages.get(i);
            System.out.print(message + " ");
        }
    }
}
