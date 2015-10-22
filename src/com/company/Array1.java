package com.company;

public class Array1 {

    /**
     * Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
     */
    public static int[] rotateLeft3(int[] nums) {
        int[] rotated = new int[nums.length];
        System.arraycopy(nums, 1, rotated, 0, nums.length - 1);
        rotated[rotated.length - 1] = nums[0];

        return rotated;
    }

    /**
     * Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last
     * element. Both arrays will be length 1 or more.
     */

    public static boolean commonEnd(int[] a, int[] b) {
        if (a[0] == b[0]) {
            return true;
        }
        else if (a[a.length - 1] == b[b.length - 1]) {
            return true;
        }
        return false;
    }


    /** We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
     */

    public static boolean unlucky1(int[] nums) {
        if (nums.length <= 1) {
            return false;
        }
        else {
            if (nums[0] == 1 && nums[1] == 3) {
                return true;
            }
            else if (nums[1] == 1 && nums[2] == 3) {
                return true;
            }
            else if (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3) {
                return true;
            }
        return false;

        }
    }

    /**
     * Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array. The original array will be length 2 or more.
     */

    public static int[] makeMiddle(int [] nums) {
        int [] result = new int[2];
        int middle = nums.length/2;
        result[0] = nums[middle -1];
        result[1] = nums[middle];
        return result;
    }

}
