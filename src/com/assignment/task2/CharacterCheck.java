package com.assignment.task2;

import java.util.Scanner;

public class CharacterCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any character: ");
        char c = scanner.next().charAt(0);

        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println("Character is an alphabet.");
        else
            System.out.println("Character is not an alphabet.");
    }
}
