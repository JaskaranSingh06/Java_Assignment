package com.assignment.task6;

class Triangle {
    int side1, side2, side3;

    public Triangle() {
        side1 = 3;
        side2 = 4;
        side3 = 5;
    }

    public double calculateArea() {
        double semiPerimeter = (side1 + side2 + side3) / 2.0;
        // Calculate area using Heron's formula
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
        return area;
    }

    public double calculatePerimeter() {
        double perimeter = side1 + side2 + side3;
        return perimeter;
    }
}

public class Part_2 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        double area = triangle.calculateArea();
        double perimeter = triangle.calculatePerimeter();

        System.out.println("Area of the triangle: " + area);
        System.out.println("Perimeter of the triangle: " + perimeter);
    }
}

