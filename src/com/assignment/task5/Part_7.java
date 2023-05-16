package com.assignment.task5;

import java.util.Arrays;
import java.util.Scanner;

public class Part_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String input = scanner.nextLine();

        boolean isIsogram = checkIsogram(input);
        if (isIsogram)
            System.out.println("Given string is Isogram i.e. contain only unique characters");
        else
            System.out.println("Given string is not Isogram i.e. contain repeating characters");

    }

    public static boolean checkIsogram(String input){
        char[] temp = input.toCharArray();
        Arrays.sort(temp);

        for (int i = 0; i < temp.length - 1; i++){
            if (temp[i] == temp[i + 1])
                return false;
        }
        return true;
    }
}
