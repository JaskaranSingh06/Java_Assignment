package com.assignment.task7;

import java.util.Scanner;

public class Part_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int numArray[] = new int[size];
        System.out.println("Enter array elements: ");
        for(int i = 0; i < numArray.length; i++){
            numArray[i] = scanner.nextInt();
        }

        int max = numArray[0];

        for (int i = 1; i < numArray.length; i++){
            if (numArray[i] > max)
                max = numArray[i];
        }

        System.out.println("Maximum value in array: " + max);
    }
}
