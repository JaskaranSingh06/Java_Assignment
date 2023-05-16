package com.assignment.task4;

import java.util.Arrays;
import java.util.Scanner;

public class Part_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int array[] = new int[size];

        System.out.println("Enter array elements: ");
        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        int[] result = removeDuplicates(array);

        System.out.println("Elements: ");
        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] removeDuplicates(int[] array) {
        int length = array.length;
        int[] temp = new int[length];
        int j = 0;

        for (int i = 0; i < length - 1; i++) {
            if (array[i] != array[i + 1]) {
                temp[j] = array[i];
                j++;
            }
        }

        temp[j] = array[length - 1];
        j++;

        while (j < length) {
            temp[j] = 0;
            j++;
        }

        return temp;
    }
}
