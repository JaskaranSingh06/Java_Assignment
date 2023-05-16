package com.assignment.task2;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number (positive or negative): ");
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("It's Over");
                break;
            }
            System.out.println("Good Going");
        }
    }
}
