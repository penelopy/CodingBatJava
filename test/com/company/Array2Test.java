package com.company;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class Array2Test {
    @Test
    public void isEverywhereReturnsCorrectBoolean() {
        int[] TestArrayA = {1, 2, 1, 3};
        int[] TestArrayB = {1, 2, 1, 3};
        int[] TestArrayC = {1, 2, 1, 3, 4};

        assertTrue(Array2.isEverywhere(TestArrayA, 1));
        assertFalse(Array2.isEverywhere(TestArrayB, 2));
        assertFalse(Array2.isEverywhere(TestArrayC, 1));

    }

    @Test
    public void sum13ReturnsCorrectValue() {
        int[] TestArrayA = {1, 2, 2, 1};
        int[] TestArrayB = {1, 1};
        int[] TestArrayC = {1, 2, 2, 1, 13};
        int[] TestArrayD = {};
        int[] TestArrayE = {1, 2, 13, 2, 1, 13};
        int[] TestArrayF = {13, 1, 2, 13, 2, 1, 13};
        int[] TestArrayG = {13, 0};

        assertThat(Array2.sum13(TestArrayA), equalTo(6));
        assertThat(Array2.sum13(TestArrayB), equalTo(2));
        assertThat(Array2.sum13(TestArrayC), equalTo(6));
        assertThat(Array2.sum13(TestArrayD), equalTo(0));
        assertThat(Array2.sum13(TestArrayE), equalTo(4));
        assertThat(Array2.sum13(TestArrayF), equalTo(3));
        assertThat(Array2.sum13(TestArrayG), equalTo(0));
    }

    @Test
    public void bigDiffReturnsCorrectValue() {
        int[] TestArrayA = {10, 3, 5, 6};
        int[] TestArrayB = {7, 2, 10, 9};
        int[] TestArrayC = {2, 10, 7, 2};

        assertThat(Array2.bigDiff(TestArrayA), equalTo(7));
        assertThat(Array2.bigDiff(TestArrayB), equalTo(8));
        assertThat(Array2.bigDiff(TestArrayC), equalTo(8));
    }

    @Test
    public void countEvensReturnsCorrectValue() {
        int[] TestArrayA = {2, 1, 2, 3, 4};
        int[] TestArrayB = {2, 2, 0};
        int[] TestArrayC = {1, 3, 5};

        assertThat(Array2.countEvens(TestArrayA), equalTo(3));
        assertThat(Array2.countEvens(TestArrayB), equalTo(3));
        assertThat(Array2.countEvens(TestArrayC), equalTo(0));
    }

    @Test
    public void either24ReturnsCorrectBoolean() {
        int[] TestArrayA = {1, 2, 2};
        int[] TestArrayB = {4, 4, 1};
        int[] TestArrayC = {4, 4, 1, 2, 2};

        assertTrue(Array2.either24(TestArrayA));
        assertTrue(Array2.either24(TestArrayB));
        assertFalse(Array2.either24(TestArrayC));

    }
}
