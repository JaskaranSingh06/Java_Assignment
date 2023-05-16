package com.assignment.task3;

import java.util.Scanner;

public class SumOfEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int count = 1;
        int sum = 0;

        while (count <= n) {
            int number = 2 * count;
            sum += number;
            count++;
        }

        System.out.println("Sum of the first " + n + " even numbers: " + sum);
    }
}
