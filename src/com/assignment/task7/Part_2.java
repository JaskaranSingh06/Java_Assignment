package com.assignment.task7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Part_2 {
    public static void main(String[] args) {
        int[] array1 = {7, 1, 3, 5, 2, 3, 6};
        int[] array2 = {3, 8, 3, 6, 20, 7};

        Set<Integer> intersectionSet = new HashSet<>();

        for (int i = 0; i < array1.length; i++){
            for (int j = 0; j < array2.length; j++){
                if (array1[i] == array2[j])
                    intersectionSet.add(array1[i]);
            }
        }

        if (!intersectionSet.isEmpty()){
            Iterator<Integer> iterator = intersectionSet.iterator();
            System.out.print("Intersection of two array: ");
            while (iterator.hasNext())
                System.out.print(iterator.next() + " ");
        }else {
            System.out.println("Both array doesn't contain any common element");
        }
    }
}
