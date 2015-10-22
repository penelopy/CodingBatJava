package com.company;


import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class String1Test {


    @Test
    public void helloNameReturnsCorrectGreeting() {
        assertThat(String1.helloName("Bob"), equalTo("Hello Bob!"));
        assertThat(String1.helloName("Alice"), equalTo("Hello Alice!"));
        assertThat(String1.helloName("X"), equalTo("Hello X!"));
    }

    @Test
    public void middleThreeReturnsCorrectValue() {
        assertThat(String1.middleThree("Candy"), equalTo("and"));
        assertThat(String1.middleThree("and"), equalTo("and"));
        assertThat(String1.middleThree("solving"), equalTo("lvi"));
    }


    @Test
    public void withoutX2ReturnsCorrectValue() {
        assertThat(String1.withoutX2("xHi"), equalTo("Hi"));
        assertThat(String1.withoutX2("Hi"), equalTo("Hi"));
        assertThat(String1.withoutX2("Hxo"), equalTo("Ho"));
        assertThat(String1.withoutX2("x"), equalTo(""));
        assertThat(String1.withoutX2(""), equalTo(""));
    }

    @Test
    public void extraFrontReturnsCorrectValue() {
        assertThat(String1.extraFront("Hello"), equalTo("HeHeHe"));
        assertThat(String1.extraFront("ab"), equalTo("ababab"));
        assertThat(String1.extraFront("H"), equalTo("HHH"));
        assertThat(String1.extraFront(""), equalTo(""));
    }
}
