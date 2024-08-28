package org.example.e104;

import java.util.Scanner;

public class E104StringManipulations {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("In:");
        String[] arr = new String[5];

        //write code from here

//this loop will help to go through every element of the array
        for (int i = 0; i < 5; i++) {
            arr [i] = input.nextLine();
        }

//this loop will go through each element of the array and pull out 3 letters of each element
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i].substring(0,3));
        }
    }
}


