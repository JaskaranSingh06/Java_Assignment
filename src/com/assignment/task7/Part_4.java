package com.assignment.task7;

public class Part_4 {
    public static void main(String[] args) {
        String str = "Keep Learning and Keep Growing";
        int space = 1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                space++;
        }

        System.out.println("String contains " + space + " words");
    }
}
