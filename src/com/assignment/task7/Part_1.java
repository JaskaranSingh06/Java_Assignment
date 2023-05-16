package com.assignment.task7;

import java.util.Scanner;

public class Part_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String input = scanner.nextLine();

        int[] counter = new int[256];
        char nonRepeating = '\0';
        for (int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            counter[ch]++;
        }

        for (int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if (counter[ch] == 1) {
                nonRepeating = ch;
                break;
            }
        }

        if (nonRepeating != '\0')
            System.out.println("First non-repeating character: " + nonRepeating);
        else
            System.out.println("No non-repeating character exist in string");
    }
}
