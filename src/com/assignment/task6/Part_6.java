package com.assignment.task6;

import java.util.Scanner;

class Complex{
    double real;
    double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex c) {
        double sumReal = this.real + c.real;
        double sumImaginary = this.imaginary + c.imaginary;
        return new Complex(sumReal, sumImaginary);
    }

    public Complex subtract(Complex c) {
        double diffReal = this.real - c.real;
        double diffImaginary = this.imaginary - c.imaginary;
        return new Complex(diffReal, diffImaginary);
    }

    public Complex multiply(Complex c) {
        double prodReal = (this.real * c.real) - (this.imaginary * c.imaginary);
        double prodImaginary = (this.real * c.imaginary) + (this.imaginary * c.real);
        return new Complex(prodReal, prodImaginary);
    }

    public String toString() {
        return real + " + " + imaginary + "i";
    }
}
public class Part_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter real part of first complex number: ");
        double real1 = scanner.nextDouble();
        System.out.print("Enter imaginary part of first complex number: ");
        double imaginary1 = scanner.nextDouble();
        System.out.print("Enter real part of second complex number: ");
        double real2 = scanner.nextDouble();
        System.out.print("Enter imaginary part of second complex number: ");
        double imaginary2 = scanner.nextDouble();

        Complex complex1 = new Complex(real1, imaginary1);
        Complex complex2 = new Complex(real2, imaginary2);

        Complex sum = complex1.add(complex2);
        Complex difference = complex1.subtract(complex2);
        Complex product = complex1.multiply(complex2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

    }
}
