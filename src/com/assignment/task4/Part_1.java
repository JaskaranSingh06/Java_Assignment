package com.assignment.task4;

import java.util.Scanner;

public class Part_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int numArray[] = new int[size];
        System.out.println("Enter array elements: ");
        for(int i = 0; i < numArray.length; i++){
            numArray[i] = scanner.nextInt();
        }

        System.out.println("Elements of array are: ");
        for (int i = 0; i < numArray.length; i++){
            System.out.print(numArray[i] + "  ");
        }

    }
}
