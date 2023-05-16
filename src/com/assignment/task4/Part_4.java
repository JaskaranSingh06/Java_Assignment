package com.assignment.task4;

import java.util.Scanner;

public class Part_4 {
    public static void main(String[] args) {
        System.out.println("**** Binary Search ****");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int numArray[] = new int[size];

        System.out.println("Enter array elements: ");
        for(int i = 0; i < numArray.length; i++){
            numArray[i] = scanner.nextInt();
        }

        int temp = 0;
        for (int i = 0; i < numArray.length; i++){
            for (int j = i+1; j < numArray.length; j++){
                if (numArray[i] > numArray[j]){
                    temp = numArray[i];
                    numArray[i] = numArray[j];
                    numArray[j] = temp;
                }
            }
        }

        System.out.print("Sorted array: ");
        for(int i = 0; i < numArray.length; i++){
            System.out.print(numArray[i] + "  ");;
        }
        System.out.println();

        System.out.print("Enter the element you want to search(Binary Search): ");
        int searchElement = scanner.nextInt();
        int result = binarySearch(searchElement, numArray);
        if (result != -1)
            System.out.println(searchElement + " is present is array");
        else
            System.out.println(searchElement + " is not present is array");

    }

    public static int binarySearch(int searchElement, int arr[]){
        int low = 0, high = arr.length - 1;
        while (low <= high){
            int mid = (low + high)/2;

            if (arr[mid] == searchElement)
                return mid;

            if (searchElement > arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}

