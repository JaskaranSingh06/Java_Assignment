package com.assignment.task5;

import java.util.Scanner;

public class Part_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String input = scanner.nextLine();

        int vowelsCounter = 0;
        int consonantsCounter = 0;

        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    vowelsCounter++;
                else
                    consonantsCounter++;
            }
        }

        System.out.println("Number of vowels: " + vowelsCounter);
        System.out.println("Number of consonants: " + consonantsCounter);
    }
}
