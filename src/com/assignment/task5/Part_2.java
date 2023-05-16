package com.assignment.task5;

public class Part_2 {
    public static void main(String[] args) {
        String input = "Consultadd Pvt";
        String output = reverseString(input);
        System.out.println("Original string: " + input);
        System.out.println("Output: " + output);
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
