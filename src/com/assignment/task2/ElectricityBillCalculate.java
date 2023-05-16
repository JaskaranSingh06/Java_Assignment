package com.assignment.task2;

import java.util.Scanner;

public class ElectricityBillCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total units consumed: ");
        int unitsConsumed = scanner.nextInt();

        double billAmount = 0.0;

        if (unitsConsumed <= 60) {
            billAmount = unitsConsumed * 0.30;
        } else if (unitsConsumed <= 150) {
            billAmount = 60 * 0.30 + (unitsConsumed - 60) * 0.75;
        } else if (unitsConsumed <= 270) {
            billAmount = 60 * 0.30 + 90 * 0.75 + (unitsConsumed - 150) * 1.10;
        } else {
            billAmount = 60 * 0.30 + 90 * 0.75 + 120 * 1.10 + (unitsConsumed - 270) * 2.50;
        }

        double surcharge = 0.2 * billAmount;
        double totalBillAmount = billAmount + surcharge;

        System.out.println("Total units consumed: " + unitsConsumed);
        System.out.println("Total Electricity bill amount: " + totalBillAmount);
    }
}
