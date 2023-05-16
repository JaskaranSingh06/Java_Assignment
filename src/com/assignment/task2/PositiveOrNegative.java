package com.assignment.task2;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = scanner.nextInt();

        if(num > 0)
            System.out.println("Number is Positive");
        else if(num < 0)
            System.out.println("Number is Negative");
        else
            System.out.println("Number is Zero");
    }
}
