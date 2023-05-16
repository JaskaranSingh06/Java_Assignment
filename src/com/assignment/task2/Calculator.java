package com.assignment.task2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.println("Press + for addition");
        System.out.println("Press - for subtraction");
        System.out.println("Press * for multiplication");
        System.out.println("Press / for division");
        char c = scanner.next().charAt(0);
        int result = 0;
        switch (c){
            case '+':
                result = a + b;
                System.out.println("Addition of two numbers: " + result);
                break;
            case '-':
                result = a - b;
                System.out.println("Subtraction of two numbers: " + result);
                break;
            case '*':
                result = a * b;
                System.out.println("Multiplication of two numbers: " + result);
                break;
            case '/':
                result = a / b;
                System.out.println("Division of two numbers: " + result);
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }
    }
}
