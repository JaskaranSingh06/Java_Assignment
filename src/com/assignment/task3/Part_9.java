package com.assignment.task3;

import java.util.Scanner;

public class Part_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        for (int i = 1 ; i <= n; i++ )
        {
            for (int j = 1 ; j <= n - i; j++ )
            {
                System.out.print(" ");
            }
            for (int k = 1 ; k <= i * 2 - 1; k++ )
            {
                if (k == 1 || k == i * 2 - 1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = n - 1 ; i > 0; i-- )
        {
            for (int j = 1 ; j <= n - i; j++ )
            {
                System.out.print(" ");
            }
            for (int k = 1 ; k <= i * 2 - 1; k++ )
            {
                if (k == 1 || k == i * 2 - 1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
