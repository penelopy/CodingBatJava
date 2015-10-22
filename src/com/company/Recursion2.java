package com.company;


public class Recursion2 {

    public static boolean groupSum(int start, int[] nums, int target) {
        if (start >= nums.length) return target == 0;

        return groupSum(start + 1, nums, target - nums[start]) || groupSum(start + 1, nums, target);

    }


public static boolean groupNoAdj(int start, int[] nums, int target) {
    if (start >= nums.length) return target == 0;

    return groupSum(start + 2, nums, target - nums[start]) ||
    groupSum(start + 1, nums, target);
    }

}
