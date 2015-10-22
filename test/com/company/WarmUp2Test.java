package com.company;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class WarmUp2Test {

    @Test
    public void stringTimesReturnsCorrectValue() {
        assertThat(WarmUp2.stringTimes("Hi", 2), equalTo("HiHi"));
        assertThat(WarmUp2.stringTimes("Hi", 3), equalTo("HiHiHi"));
        assertThat(WarmUp2.stringTimes("Hi", 1), equalTo("Hi"));
    }

    @Test
    public void frontTimesReturnsCorrectValue() {
        assertThat(WarmUp2.frontTimes("Chocolate", 2), equalTo("ChoCho"));
        assertThat(WarmUp2.frontTimes("Chocolate", 3), equalTo("ChoChoCho"));
        assertThat(WarmUp2.frontTimes("Abc", 3), equalTo("AbcAbcAbc"));
    }

    @Test
    public void countXXReturnsCorrectValue() {
        assertThat(WarmUp2.countXX("abcxx"), equalTo(1));
        assertThat(WarmUp2.countXX("xxx"), equalTo(2));
        assertThat(WarmUp2.countXX("xxxx"), equalTo(3));
    }

    @Test
    public void doubleXReturnsCorrectValue() {
        assertTrue(WarmUp2.doubleX("axxbb"));
        assertFalse(WarmUp2.doubleX("axaxax"));
        assertTrue(WarmUp2.doubleX("xxxxx"));
        assertFalse(WarmUp2.doubleX("xaxxx"));
        assertFalse(WarmUp2.doubleX("xaxx"));
    }

    @Test
    public void stringBitsReturnsCorrectValue() {
        assertThat(WarmUp2.stringBits("Hello"), equalTo("Hlo"));
        assertThat(WarmUp2.stringBits("Hi"), equalTo("H"));
        assertThat(WarmUp2.stringBits("Heeololeo"), equalTo("Hello"));
    }

    @Test
    public void stringSplosionReturnsCorrectValue() {
        assertThat(WarmUp2.stringSplosion("Code"), equalTo("CCoCodCode"));
        assertThat(WarmUp2.stringSplosion("abc"), equalTo("aababc"));
        assertThat(WarmUp2.stringSplosion("ab"), equalTo("aab"));
    }

    @Test
    public void last2ReturnsCorrectValue() {
        assertThat(WarmUp2.last2("hixxhi"), equalTo(1));
        assertThat(WarmUp2.last2("xaxxaxaxx"), equalTo(1));
        assertThat(WarmUp2.last2("axxxaaxx"), equalTo(2));
    }

    @Test
    public void arrayCountReturnsCorrectValue() {
        int [] testArrayA = {1, 2, 9};
        int [] testArrayB = {1, 9, 9};
        int [] testArrayC = {1, 9, 9, 3, 9};

        assertThat(WarmUp2.arrayCount9(testArrayA), equalTo(1));
        assertThat(WarmUp2.arrayCount9(testArrayB), equalTo(2));
        assertThat(WarmUp2.arrayCount9(testArrayC), equalTo(3));
    }

    @Test
    public void arrayFront9ReturnsCorrectValue() {
        int [] testArrayA = {1, 2, 9, 3, 4};
        int [] testArrayB = {1, 2, 3, 4, 9};
        int [] testArrayC = {1, 2, 3, 4, 5};

        assertTrue(WarmUp2.arrayFront9(testArrayA));
        assertFalse(WarmUp2.arrayFront9(testArrayB));
        assertFalse(WarmUp2.arrayFront9(testArrayC));
    }

    @Test
    public void array123ReturnsCorrectBoolean() {
        int [] testArrayA = {1, 1, 2, 3, 1};
        int [] testArrayB = {1, 1, 2, 4, 1};
        int [] testArrayC = {1, 1, 2, 1, 2, 3};

        assertTrue(WarmUp2.array123(testArrayA));
        assertFalse(WarmUp2.array123(testArrayB));
        assertTrue(WarmUp2.array123(testArrayC));
    }

    @Test
    public void stringMatchReturnsCorrectValue() {
        assertThat(WarmUp2.stringMatch("xxcaazz", "xxbaaz"), equalTo(3));
        assertThat(WarmUp2.stringMatch("abc", "abc"), equalTo(2));
        assertThat(WarmUp2.stringMatch("abc", "axc"), equalTo(0));
    }


}
