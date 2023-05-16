package com.assignment.task7;

import java.util.ArrayList;
import java.util.List;

public class Part_11 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 3, 5, 8, 2, 4, 2};
        int target = 8;
        findSubarrays(nums, target);
    }
    public static void findSubarrays(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int start = 0;
        int end = 0;
        int sum = 0;

        while (end < nums.length) {
            sum += nums[end];

            while (sum > target) {
                sum -= nums[start];
                start++;
            }

            if (sum == target) {
                List<Integer> subarray = new ArrayList<>();
                for (int i = start; i <= end; i++) {
                    subarray.add(nums[i]);
                }
                result.add(subarray);
            }
            end++;
        }

        // Print the subarrays
        for (List<Integer> subarray : result) {
            System.out.println(subarray);
        }
    }
}

