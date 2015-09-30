package com.company;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class WarmUpTest {
    @Test
    public void sleepInReturnsTrue() {
        assertTrue(WarmUps.sleepIn(false, false));
        assertTrue(WarmUps.sleepIn(false, true));
    }

    @Test
    public void sleepInReturnsFalse() {
        assertFalse(WarmUps.sleepIn(true, false));
    }

    @Test
    public void monkeyTroubleIsTrue() {
        assertTrue(WarmUps.monkeyTrouble(true, true));
        assertTrue(WarmUps.monkeyTrouble(false, false));
    }

    @Test
    public void monkeyTroubleIsFalse() {
        assertFalse(WarmUps.monkeyTrouble(true, false));
    }

    @Test
    public void sumDoubleSumsButDoesNotDoubleInput() {
        assertThat(WarmUps.sumDouble(1, 2), equalTo(3));
        assertThat(WarmUps.sumDouble(3, 2), equalTo(5));
    }

    @Test
    public void sumDoubleDoublesWhenInputIsSame() {
        assertThat(WarmUps.sumDouble(2, 2), equalTo(8));
    }


    @Test
    public void diff21ReturnsAbsValue() {
        assertThat(WarmUps.diff21(19), equalTo(2));
        assertThat(WarmUps.diff21(10), equalTo(11));
        assertThat(WarmUps.diff21(21), equalTo(0));
    }

    @Test
    public void diff21ReturnsDoubleForIntOver21() {
        assertThat(WarmUps.diff21(23), equalTo(4));
    }

    @Test
    public void parrotTroubleReturnsTrue() {
        assertTrue(WarmUps.parrotTrouble(true, 6));
    }

    @Test
    public void parrotTroubleReturnsFalse() {
        assertFalse(WarmUps.parrotTrouble(true, 7));
        assertFalse(WarmUps.parrotTrouble(false, 6));
    }

    @Test
    public void sumMakes10() {
        assertTrue(WarmUps.makes10(1, 9));
        assertFalse(WarmUps.makes10(9, 9));
    }

    @Test
    public void numIs10() {
        assertTrue(WarmUps.makes10(9, 10));
    }
}

