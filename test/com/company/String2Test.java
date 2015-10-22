package com.company;


import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class String2Test {

    @Test
    public void doubleCharReturnsCorrectValue() {
        assertThat(String2.doubleChar("The"), equalTo("TThhee"));
        assertThat(String2.doubleChar("AAbb"), equalTo("AAAAbbbb"));
        assertThat(String2.doubleChar("Hi-There"), equalTo("HHii--TThheerree"));
    }

    @Test
    public void bobThereReturnsCorrectBoolean() {
        assertTrue(String2.bobThere("abcbob"));
        assertTrue(String2.bobThere("b9b"));
        assertFalse(String2.bobThere("bac"));
        assertFalse(String2.bobThere("abcdefb"));
    }

    @Test
    public void catDogReturnsCorrectBoolean() {
        assertTrue(String2.catDog("catdog"));
        assertFalse(String2.catDog("catcat"));
        assertTrue(String2.catDog("1cat1cadodog"));
    }

    @Test
    public void repeatSeparatorReturnsCorrectValue() {
        assertThat(String2.repeatSeparator("Word", "X", 3), equalTo("WordXWordXWord"));
        assertThat(String2.repeatSeparator("This", "And", 2), equalTo("ThisAndThis"));
        assertThat(String2.repeatSeparator("This", "And", 1), equalTo("This"));
    }

    @Test
    public void starOutReturnsCorrectValue() {
        assertThat(String2.starOut("ab*cd"), equalTo("ad"));
        assertThat(String2.starOut("ab**cd"), equalTo("ad"));
        assertThat(String2.starOut("sm*eilly"), equalTo("silly"));
        assertThat(String2.starOut("*stringy"), equalTo("tringy"));
        assertThat(String2.starOut("*"), equalTo(""));
        assertThat(String2.starOut("*a"), equalTo(""));
        assertThat(String2.starOut("*str*in*gy"), equalTo("ty"));
    }


}
