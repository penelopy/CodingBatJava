package com.company;

public class WarmUps {
    //The parameter weekday is true if it is a weekday, and the parameter vacation is         true if we are on vacation. We sleep in if it is not a weekday or we're on vacation.        Return true if we sleep in.

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (vacation) {
            return true;
        }
        else if (!weekday){
            return true;
        }
        else {
            return false;
        }
    }

//    We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        }
        else if (!aSmile && !bSmile) {
            return true;
        }
        return false;
    }

//
//    Given two int values, return their sum. Unless the two values are the same, then return double their sum.

    public static int sumDouble(int a, int b) {
        if (a == b) {
            return ((a + b) *2);
        }
        else{
            return a + b;
        }
    }


//    Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

    public static int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        }
        else {
            return ((n - 21) *2);
        }
    }


//    We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
//

    public static boolean parrotTrouble(boolean talking, int hour) {
        if (talking && hour < 7) {
            return true;
        }
        else if (talking && hour > 20) {
            return true;
        }
        return false;
    }
//
//    Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
//

    public static boolean makes10(int a, int b) {
        if (a == 10 | b == 10) {
            return true;
        }
        else if (a + b == 10) {
            return true;
        }
        return false;
    }



}



