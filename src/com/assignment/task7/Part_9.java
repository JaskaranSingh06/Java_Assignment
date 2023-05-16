package com.assignment.task7;

public class Part_9 {
    public static void main(String[] args) {
        printCombinations("abc", "");
    }
    private static void printCombinations(String str, String combination) {
        if (str.length() == 0) {
            System.out.println(combination);
        } else {
            printCombinations(str.substring(1), combination + str.charAt(0));
            printCombinations(str.substring(1), combination);
        }
    }
}
