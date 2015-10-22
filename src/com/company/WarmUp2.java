package com.company;


public class WarmUp2 {

    /**
     * Given a string and a non-negative int n, return a larger string that is n copies
     * of the original string.
     */

    public static String stringTimes(String str, int n) {
        StringBuilder result = new StringBuilder();
        for (int i=0; i < n; i++) {
            result.append(str);
        }
        return result.toString();
    }

    /**
     *
     * Given a string and a non-negative int n, we'll say that the front of the string
     * is the first 3 chars, or whatever is there if the string is less than length 3.
     * Return n copies of the front;
     */

    public static String frontTimes(String str, int n) {
        String front;
        StringBuilder result = new StringBuilder();
        if (str.length() < 3) {
            front = str;
        }
        else {
            front = str.substring(0, 3);
        }
        for (int i=0; i < n; i++) {
            result.append(front);
        }
        return result.toString();
    }

    /**
     * Count the number of "xx" in the given string. We'll say that overlapping
     * is allowed, so "xxx" contains 2 "xx".
     */

    public static int countXX(String str) {
        int countX = 0;
        for (int i=0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
                countX++;
            }
        }
        return countX;
    }

    /**
     * Given a string, return true if the first instance of "x" in the string is
     * immediately followed by another "x".
     */
    public static boolean doubleX(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x') {
                if (str.charAt(i + 1) == 'x') {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /**
     * Given a string, return a new string made of every other char starting with the
     * first, so "Hello" yields "Hlo".
     */

    public static String stringBits(String str) {
        StringBuilder result = new StringBuilder();

        for (int i=0; i < str.length(); i++) {
            if (i % 2 == 0) {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    /**
     * Given a non-empty string like "Code" return a string like "CCoCodCode".
     */

    public static String stringSplosion(String str) {
        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (int i=0; i < str.length(); i++) {
            temp.append(str.charAt(i));
            result.append(temp);
        }
        return result.toString();
    }

    /**
     * Given a string, return the count of the number of times that a substring length
     * 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi"
     * yields 1 (we won't count the end substring).
     */

    public static int last2(String str) {
        if (str.length() < 2) return 0;

        String end = str.substring(str.length()-2);
        System.out.println(end);
        int count = 0;

        for (int i=0; i<str.length()-2; i++) {
            String sub = str.substring(i, i+2);
            if (sub.equals(end)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Given an array of ints, return the number of 9's in the array.
     */
    public static int arrayCount9(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 9) {
                count++;
            }
        }
        return count;
    }

    /**
     * Given an array of ints, return true if one of the first 4 elements in the array
     * is a 9. The array length may be less than 4.
     */
    public static boolean arrayFront9(int[] nums) {

        for (int i = 0; i < 4; i++) {
            if (i < nums.length) {
                if (nums[i] == 9) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Given an array of ints, return true if .. 1, 2, 3, .. appears in the array
     * somewhere.
     */
    public static boolean array123(int[] nums) {
        for (int i =0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i+2] == 3) {
                return true;
            }
        }
        return false;
    }

    /**
     * Given 2 strings, a and b, return the number of the positions where they contain
     * the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx",
     * "aa", and "az" substrings appear in the same place in both strings.
     */

    public static int stringMatch(String a, String b) {
        int count = 0;
        int length = Math.min(a.length(), b.length());

        for (int i=0; i < (length - 1); i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                count++;
            }
        }
        return count;
    }


}
