package com.assignment.task6;

class Student{
    String name;
    int enrollmentNo;
    Student(String name, int enrollmentNo){
        this.name = name;
        this.enrollmentNo = enrollmentNo;
    }
    public void getDetails(){
        System.out.println("Name: " + name + " Enrollment No: " + enrollmentNo);
    }
}
public class Part_1 {
    public static void main(String[] args) {
        System.out.println("**** Students ****");
        Student student = new Student("Amay,", 132);
        student.getDetails();
    }
}
