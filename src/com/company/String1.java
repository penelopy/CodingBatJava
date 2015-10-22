package com.company;


public class String1 {


    //Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
    public static String helloName(String name) {
        return "Hello " + name + "!";
    }


    /**
     * Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string
     * length will be at least 3.
     */
    public static String middleThree(String str) {
        int center = str.length() / 2;

        return new String(new char[]{
                str.charAt(center - 1),
                str.charAt(center),
                str.charAt(center + 1),
        });
    }

    /**
     * Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and
     * otherwise return the string unchanged. This is a little harder than it looks.  Ex. xHi
     */

    public static String withoutX2(String str) {
        char[] arr = str.toCharArray();
        StringBuilder result = new StringBuilder();
        if (str == "") {
            return str;
        } else if (arr.length == 1) {
            if (arr[0] != 'x') {
                return str;
            } else {
                return "";
            }
        } else {
            if (arr[0] != 'x') {
                result.append(arr[0]);
            }
            if (arr[1] != 'x') {
                result.append(arr[1]);
            }
            for (int i = 2; i < str.length(); i++) {
                result.append(arr[i]);
            }
            return result.toString();
        }

    }

    /**
     * Given a string, return a new string made of 3 copies of the first 2 chars of the     * original string. The string may be any length. If there are fewer than 2 chars,      * use whatever is there.
     */

    public static String extraFront(String str) {
        if (str.isEmpty()) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        int i = 0;
        if (str.length() ==1) {
            while (i <= 2) {
                result.append(str.charAt(0));
                i++;
            }
        }
        else {
            while (i <= 2) {
                result.append(str.charAt(0));
                result.append(str.charAt(1));
                i++;
            }
        }
        return result.toString();
    }
}


