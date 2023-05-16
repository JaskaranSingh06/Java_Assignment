package com.assignment.task7;

import java.util.Scanner;

public class Part_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String input = scanner.nextLine();

        int[] counter = new int[256];
        for (int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            counter[ch]++;
        }

        boolean unique = true;
        for (int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if (counter[ch] > 1) {
                unique = false;
                break;
            }
        }

        if (unique)
            System.out.println("String contains only unique character");
        else
            System.out.println("String doesn't have all unique character");
    }
}
