package com.assignment.task2;

import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your income: ");
        double income = scanner.nextDouble();
        double tax = 0.0;

        if(income >= 250000 && income <= 600000){
            tax = 0.1 * income;
        }else if(income > 600000 && income <= 1200000){
            tax = 0.18 * income;
        }else if(income > 1200000){
            tax = 0.25 * income;
        }
        System.out.println("Your income is: " + income);
        System.out.println("Tax amount: " + tax);
    }
}
