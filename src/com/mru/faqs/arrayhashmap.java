package com.mru.faqs;

import java.util.HashMap;

public class arrayhashmap { // Class name updated to follow Java convention
    public static void main(String[] args) {
        // Define and initialize the array
        int[] arr = {1, 2, 3, 4, 2, 3, 4, 2, 3, 4, 3, 4, 4};

        // Create a HashMap to store the frequency of each number
        HashMap<Integer, Integer> map = new HashMap<>();

        // Populate the map with the frequency of each element in the array
        for (int element : arr) {
            map.put(element, map.getOrDefault(element, 0) + 1);
        }

        // Iterate over the map entries and print the results
        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
