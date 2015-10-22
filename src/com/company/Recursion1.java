package com.company;

public class Recursion1 {
    /**
     * Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1.
     * Compute the result recursively (without loops).
     */

    public static int factorial(int n) {
        // factorial(4) = 4 * 3 * 2 * 1;
        // factorial(3) =     3 * 2 * 1
        // factorial(2) =         2 * 1

        // factorial(1) =             1
        // factorial(2) = 2 * factorial(1)
        // factorial(3) = 3 * factorial(2)
        // factorial(n) = n * factorial(n-1)
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    /**
     * We'll say that a "pair" in a string is two instances of a char separated by a char.
     * So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2
     * for A and 1 for x. Recursively compute the number of pairs in the given string.
     */
    public static int countPairs(String str) {
        if (str.length() < 3) {
            return 0;
        }
        if (str.length() == 3) {
            return (str.charAt(0) == str.charAt(2)) ? 1 : 0;
        }
        return countPairs(str.substring(0, 3)) + countPairs(str.substring(1));

    }

    /**
     * Given a string and a non-empty substring sub, compute recursively the largest
     * substring which starts and ends with sub and return its length.
     */
    public static int strDist(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        }
        if (str.startsWith(sub) && str.endsWith(sub)) {
            return str.length();
        }
        return Math.max(strDist(str.substring(1), sub),
                strDist(str.substring(0, str.length() - 1), sub));
    }

    /**
     * Given a non-negative int n, return the sum of its digits recursively (no loops).
     * Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide
     * (/) by 10 removes the rightmost digit (126 / 10 is 12).
     */

    public static int sumDigits(int n) {
        if (n < 10) return n;
        return sumDigits(n/10) + (n % 10);
    }

    /**
     * Given a non-negative int n, return the count of the occurrences of 7 as
     * a digit, so for example 717 yields 2. (no loops). Note that mod (%) by
     * 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10
     * removes the rightmost digit (126 / 10 is 12).
     */

    public static int count7(int n) {
        if (n < 10 && n ==7) return 1;
        else if (n < 10 && n !=7) return 0;

        else {
            if (n % 10 == 7) {
                return count7(n/10) + 1;
            }
            return count7(n/10);
        }
    }

    /**
     * Given an array of ints, compute recursively if the array contains a 6. We'll use
     * the convention of considering only the part of the array that begins at the
     * given index. In this way, a recursive call can pass index+1 to move down the
     * array. The initial call will pass in index as 0.
     */

     public static boolean array6(int[] nums, int index) {
         return index < nums.length && ((nums[index] == 6) || array6(nums, index + 1));
     }

    /**
     * Given a non-negative int n, compute recursively (no loops) the count
     * of the occurrences of 8 as a digit, except that an 8 with another 8
     * immediately to its left counts double, so 8818 yields 4. Note that mod
     * (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/)
     * by 10 removes the rightmost digit (126 / 10 is 12).
     */


    public static int count8(int n) {
        if (n == 0) return 0;
        if (n >= 88 && n % 100 == 88) return 2 + count8(n / 10);
        if (n % 10 == 8) return 1 + count8(n / 10);
        return count8(n / 10);
    }

    /**
     * Count recursively the total number of "abc" and "aba" substrings
     * that appear in the given string.
     */

    public static int countAbc(String str) {
        if (str.length() < 3) return 0;
        if (str.length() == 3) {
            if (str.charAt(0) == 'a' && str.charAt(1) == 'b' && str.charAt(2) == 'c')
                return 1;
            else if (str.charAt(0) == 'a' && str.charAt(1) == 'b' && str.charAt(2) == 'a')
                return 1;
            return 0;
        }
        return countAbc(str.substring(0, 3)) + countAbc(str.substring(1));
    }

    /**
     *
     Given an array of ints, compute recursively the number of times that the value 11 appears in the
     array. We'll use the convention of considering only the part of the array that begins at the given
     index. In this way, a recursive call can pass index+1 to move down the array. The initial call will
     pass in index as 0.
     */

    public static int array11(int[] nums, int index) {
        if (index >= nums.length) return 0;
        return ((nums[index] == 11) ? 1:0) + array11(nums, index + 1);
    }

    /**
     * Given a string, compute recursively (no loops) the number of "11" substrings in the
     * string. The "11" substrings should not overlap.
     */

    public static int count11(String str) {
        if (str.length() < 2) return 0;
        if (str.substring(0, 2).equals("11"))
            return 1 + count11(str.substring(2));
        return count11(str.substring(1));
        }

    /**
     *
     * Given a string, return recursively a "cleaned" string where adjacent chars that
     * are the same have been reduced to a single char. So "yyzzza" yields "yza".
     */
    public static String stringClean(String str) {
        if (str.length() < 2) return str;
        if (str.charAt(0) == str.charAt(1)) {
            return stringClean(str.substring(1));
        }
        return str.charAt(0) + stringClean(str.substring(1));
    }

    /**
     * Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
     */
    public static int countX(String str) {
        if (str.length() == 0) return 0;
        if (str.charAt(0) == 'x') {
            return countX(str.substring(1)) + 1;
        }
        return countX(str.substring(1));
    }

    /**
     *
     * Given base and n that are both 1 or more, compute recursively (no loops) the
     * value of base to the n power, so powerN(3, 2) is 9 (3 squared).
     */
    public static int powerN(int base, int n) {
        if (n == 0) return 0;
        if (n == 1) return base;
        return powerN(base, n - 1) * base;
    }

    /**
     * Given a string, compute recursively (no loops) the number of times lowercase
     * "hi" appears in the string.
     */
    public static int countHi(String str) {
        if (str.length() < 2) return 0;
        if (str.substring(0, 2).equals("hi")) {
            if (str.length()==2) return 1;
            return countHi(str.substring(2)) + 1;
        }
        return countHi(str.substring(1));
    }

    /**
     * Given a string, compute recursively (no loops) a new string where all the
     * lowercase 'x' chars have been changed to 'y' chars.
     */
    public static String changeXY(String str) {
        if (str.equals("")) return "";
        if (str.length() == 1 && str.charAt(0) == 'x') return "y";
        else if (str.length() == 1 && str.charAt(0) != 'x') return str;
        else {
            if (str.charAt(0) == 'x') return "y" + changeXY(str.substring(1));
            return str.charAt(0) + changeXY(str.substring(1));
        }
    }

    /**
     * Given a string, compute recursively (no loops) a new string where all appearances
     * of "pi" have been replaced by "3.14".
     */

    public static String changePi(String str) {
        if (str.length() < 2) return str;
        if (str.substring(0,2).equals("pi")) return "3.14" + changePi(str.substring(2));
        return str.charAt(0) + changePi(str.substring(1));
    }

    public Recursion1() {
    }

    /**
     * Given a string, compute recursively a new string where all the 'x' chars have been removed.
     */

    public static String noX(String str) {
        if (str.length() == 0) return "";
        if (str.length() == 1) {
            if (str.charAt(0) == 'x') return "";
            return str;
        }
        else {
            if (str.charAt(0) == 'x') return "" + noX(str.substring(1));
            return str.charAt(0) + noX(str.substring(1));
        }
    }

    /**
     * Given an array of ints, compute recursively if the array contains somewhere a
     * value followed in the array by that value times 10. We'll use the convention of
     * considering only the part of the array that begins at the given index.
     * In this way, a recursive call can pass index+1 to move down the array. The
     * initial call will pass in index as 0.
     */


    public static boolean array220(int [] nums, int index) {
        if (nums.length < 2 || index == nums.length - 1) return false;

        if (nums[index] * 10 == nums[index + 1]) return true;

        return array220(nums, index + 1);
    }

    public static String pairStar(String str) {

        if (str.length() <=1 ) return str;

        if (str.charAt(0) == str.charAt(1)) {
            return str.charAt(0) + "*" + pairStar(str.substring(1));
        }

        return str.charAt(0) + pairStar(str.substring(1));
    }

    /**
     * Given a string, compute recursively the number of times lowercase "hi" appears
     * in the string, however do not count "hi" that have an 'x' immediately before them.
     */
    public static int countHi2(String str) {
        if (str.length() < 2) return 0;
        if (str.length() == 2) {
            if (str.equals("hi")) {
                return 1;
            }
            return 0;
        }
        if (str.charAt(0) == 'x' && str.substring(1, 3).equals("hi")) {
            return countHi2(str.substring(3));
        } else if (str.substring(0, 2).equals("hi")) {
            return 1 + countHi2(str.substring(2));
        }
        return countHi2(str.substring(1));
    }

    /**
     * Given a string that contains a single pair of parenthesis,
     * compute recursively a new string made of only of the parenthesis
     * and their contents, so "xyz(abc)123" yields "(abc)".
     */
    public static String parenBit(String str) {
        if (str.length() < 2) return "";
        if (str.charAt(0) != '(' || str.charAt(0) != ')') {
            return parenBit(str.substring(1));
        }
        else if (str.charAt(0) == '(') {

            return "(" + parenBit(str.substring(1));
        }
        return ")";


    }

    /**
     * Given a string, return true if it is a nesting of zero or more pairs of
     * parenthesis, like "(())" or "((()))". Suggestion: check the first and last
     * chars, and then recur on what's inside them.
     */

    public static boolean nestParen(String str) {
        return true;
    }
}


















