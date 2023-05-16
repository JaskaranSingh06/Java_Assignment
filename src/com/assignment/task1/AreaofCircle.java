package com.assignment.task1;

import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        int radius = scanner.nextInt();

        double area = Math.PI * radius * radius;
        System.out.println("Area of circle: " + area);
    }
}
