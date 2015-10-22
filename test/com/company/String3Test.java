package com.company;


import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

public class String3Test {
    @Test
    public void maxBlockReturnsCorrectValue() {
        assertThat(String3.maxBlock("hoopla"), equalTo(2));
        assertThat(String3.maxBlock("abbCCCddBBBxx"), equalTo(3));
        assertThat(String3.maxBlock(""), equalTo(0));
        assertThat(String3.maxBlock("xyz"), equalTo(1));
    }

    @Test
    public void gHappyReturnsCorrectBoolean() {
//        assertTrue(String3.gHappy("xxggxx"));
//        assertFalse(String3.gHappy("xxgxx"));
        assertFalse(String3.gHappy("xxggyygxx"));
    }

}
