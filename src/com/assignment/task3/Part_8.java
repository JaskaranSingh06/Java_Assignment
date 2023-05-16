package com.assignment.task3;

import java.util.Scanner;

public class Part_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        boolean continueInput = true;

        while (continueInput) {
            System.out.print("Enter a number (or any non-numeric character to stop): ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                if (number > largest) {
                    largest = number;
                }
                if (number < smallest) {
                    smallest = number;
                }
            } else {
                continueInput = false;
            }
        }

        if (largest != Integer.MIN_VALUE) {
            System.out.println("Largest number entered: " + largest);
        } else {
            System.out.println("No numbers were entered.");
        }

        if (smallest != Integer.MAX_VALUE) {
            System.out.println("Smallest number entered: " + smallest);
        } else {
            System.out.println("No numbers were entered.");
        }
    }
}

