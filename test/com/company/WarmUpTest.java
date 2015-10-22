package com.company;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class WarmUpTest {
    @Test
    public void sleepInReturnsTrue() {
        assertTrue(WarmUp1.sleepIn(false, false));
        assertTrue(WarmUp1.sleepIn(false, true));
    }

    @Test
    public void sleepInReturnsFalse() {
        assertFalse(WarmUp1.sleepIn(true, false));
    }

    @Test
    public void monkeyTroubleIsTrue() {
        assertTrue(WarmUp1.monkeyTrouble(true, true));
        assertTrue(WarmUp1.monkeyTrouble(false, false));
    }

    @Test
    public void monkeyTroubleIsFalse() {
        assertFalse(WarmUp1.monkeyTrouble(true, false));
    }

    @Test
    public void sumDoubleSumsButDoesNotDoubleInput() {
        assertThat(WarmUp1.sumDouble(1, 2), equalTo(3));
        assertThat(WarmUp1.sumDouble(3, 2), equalTo(5));
    }

    @Test
    public void sumDoubleDoublesWhenInputIsSame() {
        assertThat(WarmUp1.sumDouble(2, 2), equalTo(8));
    }


    @Test
    public void diff21ReturnsAbsValue() {
        assertThat(WarmUp1.diff21(19), equalTo(2));
        assertThat(WarmUp1.diff21(10), equalTo(11));
        assertThat(WarmUp1.diff21(21), equalTo(0));
    }

    @Test
    public void diff21ReturnsDoubleForIntOver21() {
        assertThat(WarmUp1.diff21(23), equalTo(4));
    }

    @Test
    public void parrotTroubleReturnsTrue() {
        assertTrue(WarmUp1.parrotTrouble(true, 6));
    }

    @Test
    public void parrotTroubleReturnsFalse() {
        assertFalse(WarmUp1.parrotTrouble(true, 7));
        assertFalse(WarmUp1.parrotTrouble(false, 6));
    }

    @Test
    public void sumMakes10() {
        assertTrue(WarmUp1.makes10(1, 9));
        assertFalse(WarmUp1.makes10(9, 9));
    }

    @Test
    public void numIs10() {
        assertTrue(WarmUp1.makes10(9, 10));
    }

    @Test
    public void nearHundredReturnsCorrectBoolean() {
        assertTrue(WarmUp1.nearHundred(93));
        assertTrue(WarmUp1.nearHundred(99));
        assertFalse(WarmUp1.nearHundred(89));
    }

    @Test
    public void posNegReturnsCorrectBoolean() {
        assertTrue(WarmUp1.posNeg(1, -1, false));
        assertTrue(WarmUp1.posNeg(-1, 1, false));
        assertTrue(WarmUp1.posNeg(-4, -5, true));
    }

    @Test
    public void notStringReturnsCorrectValue() {
        assertThat(WarmUp1.notString("candy"), equalTo("not candy"));
        assertThat(WarmUp1.notString("x"), equalTo("not x"));
        assertThat(WarmUp1.notString("not bad"), equalTo("not bad"));
    }

    @Test
    public void missingCharReturnsCorrectValue() {
        assertThat(WarmUp1.missingChar("kitten", 1), equalTo("ktten"));
        assertThat(WarmUp1.missingChar("kitten", 0), equalTo("itten"));
        assertThat(WarmUp1.missingChar("kitten", 4), equalTo("kittn"));
    }

    @Test
    public void frontBackReturnsCorrectValue() {
        assertThat(WarmUp1.frontBack("code"), equalTo("eodc"));
        assertThat(WarmUp1.frontBack("a"), equalTo("a"));
        assertThat(WarmUp1.frontBack("ab"), equalTo("ba"));
    }

    @Test
    public void front3ReturnsCorrectValue() {
        assertThat(WarmUp1.front3("Java"), equalTo("JavJavJav"));
        assertThat(WarmUp1.front3("Chocolate"), equalTo("ChoChoCho"));
        assertThat(WarmUp1.front3("ab"), equalTo("ababab"));
        assertThat(WarmUp1.front3("a"), equalTo("aaa"));
        assertThat(WarmUp1.front3(""), equalTo(""));
    }


    @Test
    public void backAroundReturnsCorrectValue() {
        assertThat(WarmUp1.backAround("cat"), equalTo("tcatt"));
        assertThat(WarmUp1.backAround("Hello"), equalTo("oHelloo"));
        assertThat(WarmUp1.backAround("a"), equalTo("aaa"));
    }

    @Test
    public void or35ReturnsCorrectBoolean() {
        assertTrue(WarmUp1.or35(3));
        assertTrue(WarmUp1.or35(10));
        assertFalse(WarmUp1.or35(8));
    }

    @Test
    public void front22ReturnsCorrectValue() {
        assertThat(WarmUp1.front22("kitten"), equalTo("kikittenki"));
        assertThat(WarmUp1.front22("Ha"), equalTo("HaHaHa"));
        assertThat(WarmUp1.front22("abc"), equalTo("ababcab"));
    }

    @Test
    public void startHiReturnsCorrectValue() {
        assertTrue(WarmUp1.startHi("hi there"));
        assertTrue(WarmUp1.startHi("hi"));
        assertFalse(WarmUp1.startHi("hello hi"));
    }

    @Test
    public void icyHotReturnsCorrectBoolean() {
        assertTrue(WarmUp1.icyHot(120, -1));
        assertTrue(WarmUp1.icyHot(-1, 120));
        assertFalse(WarmUp1.icyHot(2, 120));
    }

    @Test
    public void in1020ReturnsCorrectBoolean() {
        assertTrue(WarmUp1.in1020(12, 99));
        assertTrue(WarmUp1.in1020(21, 12));
        assertFalse(WarmUp1.in1020(8, 99));
    }

    @Test
    public void hasTeenReturnsCorrectBoolean() {
        assertTrue(WarmUp1.hasTeen(13, 20, 10));
        assertTrue(WarmUp1.hasTeen(20, 19, 10));
        assertTrue(WarmUp1.hasTeen(20, 10, 13));
    }

    @Test
    public void loneTeenReturnsCorrectBoolean() {
        assertTrue(WarmUp1.loneTeen(13, 99));
        assertTrue(WarmUp1.loneTeen(21, 19));
        assertFalse(WarmUp1.loneTeen(13, 13));
    }

    @Test
    public void delDelReturnsCorrectValue() {
        assertThat(WarmUp1.delDel("adelbc"), equalTo("abc"));
        assertThat(WarmUp1.delDel("adelHello"), equalTo("aHello"));
        assertThat(WarmUp1.delDel("adedbc"), equalTo("adedbc"));
    }





}

