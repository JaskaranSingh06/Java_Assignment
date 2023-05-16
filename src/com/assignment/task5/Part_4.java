package com.assignment.task5;

import java.util.Scanner;

public class Part_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String str = scanner.nextLine();

        System.out.print("Enter the character you want to count: ");
        char ch = scanner.next().charAt(0);
        int counter = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ch)
                counter++;
        }

        if (counter > 0)
            System.out.println(ch + " comes " + counter + " times in " + str);
        else
            System.out.println(ch + " does not exist in the given string");

    }
}
