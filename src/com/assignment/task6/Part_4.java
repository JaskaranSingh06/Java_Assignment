package com.assignment.task6;

class Students{
    String name;
    Students(){
        this.name = "Unknown";
    }
    Students(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
public class Part_4 {
    public static void main(String[] args) {
        Students students1 = new Students();
        Students students2 = new Students("Jaskaran");

        System.out.println("Student Name: " + students1.getName());
        System.out.println("Student Name: " + students2.getName());

    }
}
