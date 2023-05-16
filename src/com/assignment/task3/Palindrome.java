package com.assignment.task3;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int num = scanner.nextInt();

        int originalNumber = num;
        int reverse = 0, remainder;

        while(num != 0){
            remainder = num % 10;
            num = num / 10;
            reverse = reverse * 10 + remainder;
        }

        if(originalNumber == reverse)
            System.out.println(originalNumber + " is palindrome");
        else
            System.out.println(originalNumber + " is not a palindrome");

    }
}
