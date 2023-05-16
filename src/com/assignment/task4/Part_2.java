package com.assignment.task4;

import java.util.Scanner;

public class Part_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int numArray[] = new int[size];
        System.out.println("Enter array elements: ");
        for(int i = 0; i < numArray.length; i++){
            numArray[i] = scanner.nextInt();
        }

        double average = 0.0;
        int sum = 0;

        for (int i = 0; i < numArray.length; i++){
            sum += numArray[i];
        }
        average = sum/numArray.length;
        System.out.println("Average of array's element: " + average);
    }
}

