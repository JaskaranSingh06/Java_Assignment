package com.assignment.task4;

import java.util.Arrays;
import java.util.Scanner;

public class Part_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int array[] = new int[size];

        System.out.println("Enter array elements: ");
        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the target sum you want: ");
        int targetSum = scanner.nextInt();

        int[] result = findSumElements(array, targetSum);

        if (result != null) {
            System.out.println("The elements " + result[0] + " and " + result[1] + " have a sum equal to " + targetSum);
        } else {
            System.out.println("No two elements have a sum equal to " + targetSum);
        }
    }

    public static int[] findSumElements(int[] array, int target) {
        int[] result = new int[2];

        // Sort the array
        Arrays.sort(array);

        int left = 0;
        int right = array.length - 1;

        // Find the two elements with the sum equal to the target
        while (left < right) {
            int sum = array[left] + array[right];
            if (sum == target) {
                result[0] = array[left];
                result[1] = array[right];
                return result;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        // No two elements have a sum equal to the target
        return null;
    }
}

