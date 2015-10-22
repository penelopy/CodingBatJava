package com.company;


public class String2 {

    /**
     * Given a string, return a string where for every char in the original, there are two
     * chars
     */

    public static String doubleChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = result + str.charAt(i) + str.charAt(i);
        }
        return result;
    }
    // This also works
//    public static String doubleChar(String str) {
//        StringBuilder result = new StringBuilder();
//        char [] arr = str.toCharArray();
//        for (char c : arr) {
//            result.append(c);
//            result.append(c);
//        }
//        return result.toString();
//    }

    /**
     * Return true if the given string contains a "bob" string, but where the middle 'o'
     * char can be any char.
     */

    public static boolean bobThere(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length()) {
                if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') return true;
            }
        }
        return false;
    }

    /**
     * Return true if the string "cat" and "dog" appear the same number of times in the
     * given string.
     */

    public static boolean catDog(String str) {
        int cat = 0;
        int dog = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length()) {
                if (str.charAt(i) == 'c') {
                    if (str.charAt(i + 1) == 'a') {
                        if (str.charAt(i + 2) == 't') {
                            cat++;
                        }
                    }
                }
            }
            if (i + 2 < str.length()) {
                if (str.charAt(i) == 'd') {
                    if (str.charAt(i + 1) == 'o') {
                        if (str.charAt(i + 2) == 'g') {
                            dog++;
                        }
                    }
                }
            }
        }
        return cat == dog;
    }

    /**
     * Given two strings, word and a separator, return a big string made of count
     * occurences of the word, separated by the separator string.
     */

    public static String repeatSeparator(String word, String sep, int count) {
        StringBuilder result = new StringBuilder();

        if (count == 1) return word;
        else {
            for (int i = 0; i < count; i++) {
                result.append(word);
                if (i < count - 1) {
                    result.append(sep);
                }
            }
        }
        return result.toString();
    }

    /**
     * Return a version of the given string, where for every star (*) in the string the
     * star and the chars immediately to its left and right are gone. So "ab*cd" yields
     * "ad" and "ab**cd" also yields "ad".
     */

    enum State { start, text, star };

    public static String starOut(String str) {
        State state = State.start;
        StringBuilder result = new StringBuilder();
        char[] prev = new char[1];

        for (char next : str.toCharArray()) {
            state = nextState(state, result, prev, next);
        }

        // ugly special case for the last character
        if (prev[0] != '*' && prev[0] != 0) {
            result.append(prev[0]);
        }

        return result.toString();
    }

    private static State nextState(State curState, StringBuilder sb, char[] prev, char
            next) {
        switch (curState) {
           case start:
               if (next == '*') {
                   return State.star;
               } else {
                   prev[0] = next;
                   return State.text;
               }
            case text:
                if (next == '*') {
                    prev[0] = '*';
                    return State.star;
                } else {
                    sb.append(prev[0]);
                    prev[0] = next;
                    return State.text;
                }
            case star:
                if (next == '*') {
                    return State.star;
                } else {
                    prev[0] = 0;
                    return State.start;
                }
        }

        // fail fast
        throw new IllegalStateException("wtf");
    }



    public static String starOutOrig(String str) {
        StringBuilder strResult = new StringBuilder();
        char prev = 0;

        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);

            if (cur == '*') {
                prev = '*';
            }
            else {
                if (prev == 0) {
                    prev = cur;
                }
                else if (prev == '*') {
                    prev = 0;
                }
                else {
                    strResult.append(prev);
                    prev = cur;
                }
            }

        }
        if (prev != '*' && prev != 0) {
            strResult.append(prev);
        }
        return strResult.toString();

    }
}




