package com.company;


import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class Recursion2Test {

    @Test
    public void groupSumReturnsCorrectBoolean() {
        int [] testArrayA = {2, 4, 8};
        assertTrue(Recursion2.groupSum(0, testArrayA, 10));
        assertTrue(Recursion2.groupSum(0, testArrayA, 14));
        assertFalse(Recursion2.groupSum(0, testArrayA, 9));
    }


    @Test
    public void groupNoAdjReturnsCorrectBoolean() {
        int [] testArrayA = {2, 5, 10, 4};

//        assertTrue(Recursion2.groupNoAdj(0, testArrayA, 12));
        assertFalse(Recursion2.groupNoAdj(0, testArrayA, 14));
//        assertFalse(Recursion2.groupNoAdj(0, testArrayA, 7));
    }

}
