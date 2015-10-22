package com.company;

public class Array2 {

    /**
     * We'll say that a value is "everywhere" in an array if for every pair
     * of adjacent elements in the array, at least one of the pair is that
     * value. Return true if the given value is everywhere in the array.
     */

    public static boolean isEverywhere(int[] nums, int val) {
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length) {
                if (nums[i] != val && nums[i + 1] != val) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Return the sum of the numbers in the array, returning 0 for an empty array.
     * Except the number 13 is very unlucky, so it does not count and numbers that
     * come immediately after a 13 also do not count.
     */

    public static int sum13(int[] nums) {
        int sum = 0;
        if (nums.length == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 13) {
                sum += nums[i];
            }
            else {
                i = i + 1;
            }
        }
        return sum;
    }

    /**
     * Given an array length 1 or more of ints, return the difference between the
     * largest and smallest values in the array. Note: the built-in Math.min(v1, v2)
     * and Math.max(v1, v2) methods return the smaller or larger of two values.
     */

    public static int bigDiff(int[] nums) {
        int bigInt = nums[0];
        int smallInt = nums[0];

        for (int num : nums) {
            if (num < smallInt) {
                smallInt = num;
            } else if (num > bigInt) {
                bigInt = num;
            }
        }
        return bigInt - smallInt;
    }

    /**
     * Return the number of even ints in the given array. Note: the % "mod"
     * operator computes the remainder, e.g. 5 % 2 is 1.
     */

    public static int countEvens(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num % 2 ==0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Given an array of ints, return true if the array contains a 2 next to
     * a 2 or a 4 next to a 4, but not both.
     */

    public static boolean either24(int[] nums) {
        boolean is24 = false;
        for (int i =0; i < nums.length; i++) {
            if (i + 1 < nums.length && nums[i] == nums[i+1]) {
                is24 = !is24;
            }
        }
        return is24;
    }
}
