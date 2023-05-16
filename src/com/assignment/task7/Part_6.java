package com.assignment.task7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Part_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String input = scanner.nextLine();

        countCharacter(input);
    }
     public static void countCharacter(String input){
         Map<Character, Integer> counter = new HashMap<>();

         char[] charArray = input.toCharArray();

         for (char ch : charArray){
             if (counter.containsKey(ch))
                 counter.put(ch, counter.get(ch) + 1);
             else
                 counter.put(ch, 1);
         }

         System.out.println("*** Character Counting ***");
         for (Map.Entry<Character, Integer> map: counter.entrySet()){
             System.out.println(map.getKey() + " occurs " + map.getValue() + " times ");
         }
     }
}
