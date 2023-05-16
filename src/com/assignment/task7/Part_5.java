package com.assignment.task7;

import java.util.Scanner;

public class Part_5 {
    public static void main(String[] args) {
        System.out.println("**** Armstrong number ****");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int input = scanner.nextInt();

        if (checkArmstrong(input))
            System.out.println(input + " is an Armstrong number");
        else
            System.out.println(input + " is not an Armstrong number");
    }

    public static boolean checkArmstrong(int input){
        int originalNumber = input;
        int sum = 0;
        int numberofDigits = 0;
        //Counting number of digits
        while (input > 0) {
            input /= 10;
            numberofDigits++;
        }

        input = originalNumber;

        while (input > 0){
            int remainder = input % 10;
            sum += Math.pow(remainder, numberofDigits);
            input /= 10;
        }

        return (sum == originalNumber);
    }
}
