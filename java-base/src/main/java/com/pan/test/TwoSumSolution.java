package com.pan.test;

import java.util.*;

/**
 * Created by OneOpiece on 2017/9/6.
 */
public class TwoSumSolution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            integerMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (integerMap.containsKey(temp) && integerMap.get(temp) != i) {
                return new int[]{i, integerMap.get(temp)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static int[] twoSumSecond(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {3,2,5,8};
        int target = 7;
        int[] result = twoSumSecond(nums, target);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
