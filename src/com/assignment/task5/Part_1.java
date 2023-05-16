package com.assignment.task5;

public class Part_1 {
    public static void main(String[] args) {
        String original = "Consultadd";
        String reverse = "";

        System.out.println("Original string: " + original);

        for (int i = original.length() - 1; i >= 0 ; i--){
            reverse = reverse + original.charAt(i);
        }

        System.out.println("Reverse string: " + reverse);
    }
}
