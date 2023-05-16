package com.assignment.task5;

import java.util.Scanner;

public class ReverseSentences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any sentence: ");

        String input = scanner.nextLine();
        String output = reverseString(input);

        System.out.println("Original Sentence: " + input);
        System.out.println("Output Sentence: " + output);
    }

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        StringBuilder wordReversed = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c != ' ') {
                wordReversed.insert(0, c);
            } else {
                reversed.append(wordReversed).append(" ");
                wordReversed.setLength(0);
            }
        }

        // Append the last word
        reversed.append(wordReversed);

        return reversed.toString();
    }

}
