package com.assignment.task7;

public class Part_7 {
    public static void main(String[] args) {
        String input = "ABC";
        printPermutations("", input);
    }

    public static void printPermutations(String current, String rem) {
        if (rem.length() == 0) {
            System.out.print(current + " ");
            return;
        }
        for (int i = 0; i < rem.length(); i++) {
            String str = rem.substring(0, i) + rem.substring(i + 1);
            printPermutations(current + rem.charAt(i), str);
        }
    }
}
