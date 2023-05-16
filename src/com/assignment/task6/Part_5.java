package com.assignment.task6;

class Rectangle{
    double length;
    double breadth;
    // No parameterized constructor
    public Rectangle() {
        this.length = 0.0;
        this.breadth = 0.0;
    }
    // Parameterized constructor
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    // Constructor with one paramater
    public Rectangle(double num) {
        this.length = num;
        this.breadth = num;
    }

    public double calculateArea(){
        return length * breadth;
    }
}
public class Part_5 {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(9,5);
        Rectangle rect3 = new Rectangle(6);

        System.out.println("Area of first rectangle: " + rect1.calculateArea());
        System.out.println("Area of second rectangle: " + rect2.calculateArea());
        System.out.println("Area of third rectangle: " + rect3.calculateArea());

    }
}
