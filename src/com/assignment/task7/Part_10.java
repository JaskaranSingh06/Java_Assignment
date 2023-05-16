package com.assignment.task7;

import java.util.*;

public class Part_10 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(4, "abc");
        hashMap.put(1, "bdd");
        hashMap.put(3, "xyz");
        hashMap.put(7, "aac");
        hashMap.put(10, "efg");
        hashMap.put(2, "eff");

        System.out.println("Before sorting: " + hashMap);

        TreeMap<Integer, String> treeMap = new TreeMap<>(hashMap);
        System.out.println("Sorted by using keys: " + treeMap);

        List<Map.Entry<Integer, String>> list = new LinkedList<>(hashMap.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer, String> >() {
            public int compare(Map.Entry<Integer, String> o1,
                               Map.Entry<Integer, String> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<Integer, String> sortedByValue = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> aa : list) {
            sortedByValue.put(aa.getKey(), aa.getValue());
        }
        System.out.println("Sorted by values: " + sortedByValue);

    }
}
