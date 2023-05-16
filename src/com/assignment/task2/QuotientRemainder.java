package com.assignment.task2;

public class QuotientRemainder {
    public static void main(String[] args) {
        int dividend = 80, divisor = 7;
        int quotient, remainder;
        quotient = dividend / divisor;
        remainder = dividend % divisor;

        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}
