package com.assignment.task4;

import java.util.Scanner;

public class Part_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int array[] = new int[size];

        System.out.println("Enter array elements: ");
        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Array: [ ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");;
        }
        System.out.println("]");

        System.out.print("Enter the target sum you want: ");
        int targetSum = scanner.nextInt();

        int[] indices = findIndices(array, targetSum);

        if (indices != null) {
            System.out.println("The elements at index " + indices[0] + " and " + indices[1] + " have a sum equal to " + targetSum);
        } else {
            System.out.println("No two elements have a sum equal to " + targetSum);
        }
    }

    public static int[] findIndices(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return null; // No two numbers add up to the target
    }
}
