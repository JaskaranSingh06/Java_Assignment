package com.assignment.task5;

import java.util.Arrays;
import java.util.Scanner;

public class Part_3 {
    public static void main(String[] args) {
        System.out.println("**** String Anagram ****");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        String sortedStr1 = sortString(str1);
        String sortedStr2 = sortString(str2);

        if (sortedStr1.equals(sortedStr2))
            System.out.println("Both the string are Anagrams of each other");
        else
            System.out.println("Both the string are not Anagrams of each other");
    }

    public static String sortString(String str){
        char[] temp = str.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }
}
