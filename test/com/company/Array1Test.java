package com.company;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class Array1Test {

    @Test
    public void rotateLeft3ReturnsCorrectValue() {
        int[] testArray1 = {5, 11, 19};
        int[] testArray2 = {7, 0, 0};
        int[] result1 = {11, 19, 5};
        int[] result2 = {0, 0, 7};
        assertThat(Array1.rotateLeft3(testArray1), equalTo(result1));
        assertThat(Array1.rotateLeft3(testArray2), equalTo(result2));
    }

    @Test
    public void commonEndReturnsCorrectBoolean() {

        int[] testArrayA = {1, 2, 3};
        int[] testArrayB = {7, 3};
        int[] testArrayC = {7, 3, 2};
        int[] testArrayD = {1, 3};

        assertTrue(Array1.commonEnd(testArrayA, testArrayB));
        assertFalse(Array1.commonEnd(testArrayA, testArrayC));
        assertTrue(Array1.commonEnd(testArrayA, testArrayD));
    }

    @Test
    public void unlucky1ReturnsCorrectBoolean() {
        int[] testArrayA = {1, 3, 4, 5};
        int[] testArrayB = {2, 1, 3, 4, 5};
        int[] testArrayC = {1, 1, 1};
        int[] testArrayD = {1}; //false
        int[] testArrayE = {}; //false

        assertTrue(Array1.unlucky1(testArrayA));
        assertTrue(Array1.unlucky1(testArrayB));
        assertFalse(Array1.unlucky1(testArrayC));
        assertFalse(Array1.unlucky1(testArrayD));
        assertFalse(Array1.unlucky1(testArrayE));
    }

    @Test
    public void makeMiddleReturnsCorrectValue() {
        int [] testArrayA = {1, 2, 3, 4};
        int [] resultA = {2, 3};
        int [] testArrayB = {7, 1, 2, 3, 4, 9};
        int [] resultB = {2, 3};
        int [] testArrayC = {1, 2};
        int [] resultC = {1, 2};

        assertThat(Array1.makeMiddle(testArrayA), equalTo(resultA));
        assertThat(Array1.makeMiddle(testArrayB), equalTo(resultB));
        assertThat(Array1.makeMiddle(testArrayC), equalTo(resultC));
    }
}
