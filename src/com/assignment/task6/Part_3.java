package com.assignment.task6;

class Employee{
    String name;
    String address;
    int yearOfJoining;
    int salary;

    public Employee(String name, int yearOfJoining, String address, int salary) {
        this.name = name;
        this.address = address;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return name + "   " + yearOfJoining + "   " + address + "  " + salary;
    }
}
public class Part_3 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Robert", 1994, "64C-Walls Street", 65000);
        Employee emp2 = new Employee("Sam", 2000, "68D-Walls Street", 75000);
        Employee emp3 = new Employee("John", 1999, "26B-Walls Street", 68000);

        System.out.println("Name" + "  " + "YearOfJoining" + "  " + "Address" + "  " + "Salary");
        System.out.println("--------------------------------------");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);

    }
}
