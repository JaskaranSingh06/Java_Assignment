package com.assignment.task4;

import java.util.Scanner;

public class Part_3 {
    public static void main(String[] args) {
        System.out.println("**** Linear Search ****");
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
        System.out.println();
        System.out.print("Enter the element you want to search(Linear Search): ");
        int searchElement = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < numArray.length; i++){
            if (numArray[i] == searchElement){
                found = true;
                break;
            }
        }
        if (found)
            System.out.println(searchElement + " is present is array");
        else
            System.out.println(searchElement + " is not present is array");

    }
}

