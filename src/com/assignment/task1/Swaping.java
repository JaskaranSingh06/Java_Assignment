package com.assignment.task1;

public class Swaping {
    public static void main(String[] args) {
        //swaping by using third variable
        System.out.println("*** Swaping using third variable ***");
        int a = 10, b = 50;
        System.out.println("*** Before swap ***");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);

        int result = a;
        a = b;
        b = result;

        System.out.println("*** After swap ***");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);

        System.out.print("\n");

        //swaping without using third variable
        System.out.println("*** Swaping without using third variable ***");
        int m = 30, n = 70;
        System.out.println("*** Before swap ***");
        System.out.println("First number = " + m);
        System.out.println("Second number = " + n);

        m = m + n;
        n = m - n;
        m = m - n;

        System.out.println("*** After swap ***");
        System.out.println("First number = " + m);
        System.out.println("Second number = " + n);

    }
}
