package com.assignment.task5;

import java.util.Scanner;

public class Part_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter any substring: ");
        String subString = scanner.nextLine();
        boolean found = checkSubstring(inputString, subString);

        if (found)
            System.out.println("The string contains the substring");
        else
            System.out.println("The string doesn't contain the substring");

    }

    public static boolean checkSubstring(String inputString, String substring) {
        int inputLength = inputString.length();
        int subLength = substring.length();

        for (int i = 0; i <= inputLength - subLength; i++) {
            int j;
            for (j = 0; j < subLength; j++) {
                if (inputString.charAt(i + j) != substring.charAt(j)) {
                    break;
                }
            }

            if (j == subLength) {
                return true;
            }
        }

        return false;
    }
}
