package com.company;

public class WarmUp1 {

    //The parameter weekday is true if it is a weekday, and the parameter vacation is         true if we are on vacation. We sleep in if it is not a weekday or we're on vacation.        Return true if we sleep in.
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return vacation || !weekday;
    }

    //We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
//        return aSmile && bSmile || !aSmile && !bSmile;
        return aSmile == bSmile;
    }

    //Given two int values, return their sum. Unless the two values are the same, then return double their sum.
    public static int sumDouble(int a, int b) {
        return a == b ? (a + b) * 2 : a + b;
    }


    //Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
    public static int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return ((n - 21) * 2);
        }
    }


    //We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
    public static boolean parrotTrouble(boolean talking, int hour) {
        return talking && hour < 7 || talking && hour > 20;
    }

    //Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
    public static boolean makes10(int a, int b) {
        if (a == 10 | b == 10) {
            return true;
        } else if (a + b == 10) {
            return true;
        }
        return false;
    }

    /**
     * TODO Given an int n, return true if it is within 10 of 100 or 200. Note:
     * Math.abs(num) computes the absolute value of a number.
     */

    public static boolean nearHundred(int n) {
        if (Math.abs(n) >= 90 && Math.abs(n) <= 110) return true;

        else if (Math.abs(n) >= 190 && Math.abs(n) <= 210) return true;
        return false;
    }

    /**
     * Given 2 int values, return true if one is negative and one is positive. Except if
     * the parameter "negative" is true, then return true only if both are negative.
     */
    public static boolean posNeg(int a, int b, boolean negative) {
        if (!negative) {
            return a < 0 && b > 0 || a > 0 && b < 0;
        }
        return (a < 0 && b < 0);

    }

    /**
     * Given a string, return a new string where "not " has been added to the front.
     * However, if the string already begins with "not", return the string unchanged.
     * Note: use .equals() to compare 2 strings.
     */

    public static String notString(String str) {
        StringBuilder result = new StringBuilder();
        if (str.length() < 3) {
            result.append("not ");
            result.append(str);
        }
        else if (str.substring(0, 3).equals("not")) return str;
        else {
            result.append("not ");
            result.append(str);
        }
        return result.toString();
    }


    /**
     *
     * Given a non-empty string and an int n, return a new string where the char at index
     * n has been removed. The value of n will be a valid index of a char in the original
     * string (i.e. n will be in the range 0..str.length()-1 inclusive).
     */

    public static String missingChar(String str, int n) {
        StringBuilder result = new StringBuilder();
        char [] arr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (i != n) {
                result.append(arr[i]);
            }
        }
        return result.toString();
    }

    /**
     * Given a string, return a new string where the first and last chars have been
     * exchanged.
     */
    public static String frontBack(String str) {
        if (str.length() <= 1) return str;
        String middle = str.substring(1, str.length() - 1);
        return str.charAt(str.length() -1) + middle + str.charAt(0);
    }

    /**
     * Given a string, we'll say that the front is the first 3 chars of the string. If
     * the string length is less than 3, the front is whatever is there. Return a new
     * string which is 3 copies of the front.
     */
    public static String front3(String str) {
        String front;
        if (str.length() > 3) {
            front = str.substring(0,3);
        }
        else {
            front = str;
        }
        return front + front + front;
    }

    /**
     * Given a string, take the last char and return a new string with the last char added
     * at the front and back, so "cat" yields "tcatt". The original string will be length
     * 1 or more.
     */
    public static String backAround(String str) {
        String last = str.substring(str.length() -1);
        return last + str + last;
    }

    /**
     * Return true if the given non-negative number is a multiple of 3 or a multiple of
     * 5. Use the % "mod" operator
     */
    public static boolean or35(int n) {
        return (n % 3 == 0 || n % 5 ==0);
    }

    /**
     * Given a string, take the first 2 chars and return the string with the 2 chars
     * added at both the front and back, so "kitten" yields"kikittenki". If the string
     * length is less than 2, use whatever chars are there.
     */
    public static String front22(String str) {
        int take = 2;
        if (take > str.length()) {
            take = str.length();
        }
        String front = str.substring(0, take);
        return front + str + front;
    }


    /**
     * Given a string, return true if the string starts with "hi" and false otherwise.
     */
    public static boolean startHi(String str) {
        if (str.length() < 2) return false;
        return (str.substring(0, 2).equals("hi"));
    }

    /**
     * Given two temperatures, return true if one is less than 0 and the other is greater
     * than 100.
     */
    public static boolean icyHot(int temp1, int temp2) {
        return true;
    }

    /**
     * Given 2 int values, return true if either of them is in the range 10..20 inclusive.
     */

    public static boolean in1020(int a, int b) {
        return true;
    }

    /**
     * We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3
     * int values, return true if 1 or more of them are teen.
     */

    public static boolean hasTeen(int a, int b, int c) {
        return true;
    }


    /**
     * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
     * Given 2 int values, return true if one or the other is teen, but not both.
     */
    public static boolean loneTeen(int a, int b) {
        return true;
    }

    /**
     * Given a string, if the string "del" appears starting at index 1, return a string
     * where that "del" has been deleted. Otherwise, return the string unchanged.
     */

    public static String delDel(String str) {
        return "hi";
    }



}



