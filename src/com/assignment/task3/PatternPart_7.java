package com.assignment.task3;

import java.util.Scanner;

public class PatternPart_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = n-i; j >= 1; j--){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
