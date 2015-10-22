package com.company;


public class String3 {

    /**
     * Given a string, return the length of the largest "block" in the string.
     * A block is a run of adjacent chars that are the same.
     */

    /**
     * loop through string
     * check if adjacent characters match
     * if they do increment the count variable
     * when they don't match the next char - determine if this is the current largest block
     * then reset count to 0 and keep checking
     *
     */

    public static int maxBlock(String str) {
        if (str.length() ==0) return 0;

        int largestBlock = 0;
        int count = 1;
        char [] arr = str.toCharArray();
        char currentChar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (currentChar == arr[i]) {
                count++;
                if (count > largestBlock) {
                    largestBlock = count;
                }
            } else {
                count = 1;
                currentChar = arr[i];
            }
        }
        if (count > largestBlock) return count;
        return largestBlock;
    }

    /**
     *
     * We'll say that a lowercase 'g' in a string is "happy" if there is
     * another 'g' immediately to its left or right. Return true if all the
     * g's in the given string are happy.
     */

    public static boolean gHappy(String str) {
//        boolean happy = false;
//        for (int i = 0; i < str.length(); i++) {
//            if (i + 1 < str.length()) {
//                if (str.charAt(i) == 'g' && str.charAt(i + 1) == 'g') {
//                    happy = true;
//                }
//                else if (str.charAt(i) == 'g' && str.charAt(i + 1) != 'g') {
//                    happy = false;
//                }
//            }
//        }
        return true;
    }
}
