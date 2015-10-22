package com.company;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class Recursion1Test {

    @Test
    public void factorialReturnsCorrectValue() {
        assertThat(Recursion1.factorial(1), equalTo(1));
        assertThat(Recursion1.factorial(2), equalTo(2));
        assertThat(Recursion1.factorial(3), equalTo(6));
    }

    @Test
    public void countPairsReturnsCorrectValue() {
        assertThat(Recursion1.countPairs("axa"), equalTo(1));
        assertThat(Recursion1.countPairs("axax"), equalTo(2));
        assertThat(Recursion1.countPairs("axbx"), equalTo(1));
    }

    @Test
    public void strDistReturnsCorrectValue() {
        assertThat(Recursion1.strDist("catcowcat", "cat"), equalTo(9));
        assertThat(Recursion1.strDist("catcowcat", "cow"), equalTo(3));
        assertThat(Recursion1.strDist("cccatcowcatxx", "cat"), equalTo(9));
    }

    @Test
    public void sumDigitsReturnsCorrectValue() {
        assertThat(Recursion1.sumDigits(126), equalTo(9));
        assertThat(Recursion1.sumDigits(49), equalTo(13));
        assertThat(Recursion1.sumDigits(12), equalTo(3));
    }

    @Test
    public void count7ReturnsCorrectValue() {
        assertThat(Recursion1.count7(717), equalTo(2));
        assertThat(Recursion1.count7(7), equalTo(1));
        assertThat(Recursion1.count7(123), equalTo(0));
        assertThat(Recursion1.count7(47571), equalTo(2));
        assertThat(Recursion1.count7(99999), equalTo(0));
        assertThat(Recursion1.count7(99799), equalTo(1));
    }

    @Test
    public void array6ReturnsCorrectValue() {
        int [] testArrayA = {1, 6, 4};
        int [] testArrayB = {1, 4};
        int [] testArrayC = {6};

        assertTrue(Recursion1.array6(testArrayA, 0));
        assertFalse(Recursion1.array6(testArrayB, 0));
        assertTrue(Recursion1.array6(testArrayC, 0));
    }

    @Test
    public void count8ReturnsCorrectValue() {
        assertThat(Recursion1.count8(8), equalTo(1));
        assertThat(Recursion1.count8(818), equalTo(2));
        assertThat(Recursion1.count8(8818), equalTo(4));
        assertThat(Recursion1.count8(8088), equalTo(4));
    }

    @Test
    public void countAbcReturnsCorrectValue() {
        assertThat(Recursion1.countAbc("abc"), equalTo(1));
        assertThat(Recursion1.countAbc("abcxxabc"), equalTo(2));
        assertThat(Recursion1.countAbc("abaxxaba"), equalTo(2));
    }

    @Test
    public void array11ReturnsCorrectValue() {
        int [] testArrayA = {1, 2, 11};
        int [] testArrayB = {11, 11};
        int [] testArrayC = {1, 2, 3, 4};

        assertThat(Recursion1.array11(testArrayA, 0), equalTo(1));
        assertThat(Recursion1.array11(testArrayB, 0), equalTo(2));
        assertThat(Recursion1.array11(testArrayC, 0), equalTo(0));
    }

    @Test
    public void count11ReturnsCorrectValue() {
        assertThat(Recursion1.count11("11abc11"), equalTo(2));
        assertThat(Recursion1.count11("abc11x11x11"), equalTo(3));
        assertThat(Recursion1.count11("111"), equalTo(1));
    }

    @Test
    public void stringCleanReturnsCorrectString() {
        assertThat(Recursion1.stringClean("yyzzza"), equalTo("yza"));
        assertThat(Recursion1.stringClean("abbbcdd"), equalTo("abcd"));
        assertThat(Recursion1.stringClean("Hello"), equalTo("Helo"));
    }

    @Test
    public void countXReturnsCorrectValue() {
        assertThat(Recursion1.countX("xxhixx"), equalTo(4));
        assertThat(Recursion1.countX("xhixhix"), equalTo(3));
        assertThat(Recursion1.countX("hi"), equalTo(0));
    }

    @Test
    public void powerNReturnsCorrectValue() {
        assertThat(Recursion1.powerN(3, 1), equalTo(3));
        assertThat(Recursion1.powerN(3, 2), equalTo(9));
        assertThat(Recursion1.powerN(3, 3), equalTo(27));
    }

    @Test
    public void countHiReturnsCorrectValue() {
        assertThat(Recursion1.countHi("xxhixx"), equalTo(1));
        assertThat(Recursion1.countHi("xhixhix"), equalTo(2));
        assertThat(Recursion1.countHi("hi"), equalTo(1));
    }

    @Test
    public void changeXYReturnsCorrectValue() {
        assertThat(Recursion1.changeXY("codex"), equalTo("codey"));
        assertThat(Recursion1.changeXY("xxhixx"), equalTo("yyhiyy"));
        assertThat(Recursion1.changeXY("xhixhix"), equalTo("yhiyhiy"));
        assertThat(Recursion1.changeXY(""), equalTo(""));
    }

    @Test
    public void changePiReturnsCorrectValue() {
        assertThat(Recursion1.changePi("xpix"), equalTo("x3.14x"));
        assertThat(Recursion1.changePi("pipi"), equalTo("3.143.14"));
        assertThat(Recursion1.changePi("pip"), equalTo("3.14p"));
    }

    @Test
    public void noXReturnsCorrectValue() {
        assertThat(Recursion1.noX("xaxb"), equalTo("ab"));
        assertThat(Recursion1.noX("abc"), equalTo("abc"));
        assertThat(Recursion1.noX("xx"), equalTo(""));
    }

    @Test
    public void array220ReturnsCorrectValue() {
        int [] testArrayA = {1, 2, 20};
        int [] testArrayB = {3, 30};
        int [] testArrayC = {3};

        assertTrue(Recursion1.array220(testArrayA, 0));
        assertTrue(Recursion1.array220(testArrayB, 0));
        assertFalse(Recursion1.array220(testArrayC, 0));
    }

    @Test
    public void pairStarReturnsCorrectValue() {
        assertThat(Recursion1.pairStar("hello"), equalTo("hel*lo"));
        assertThat(Recursion1.pairStar("xxyy"), equalTo("x*xy*y"));
        assertThat(Recursion1.pairStar("aaaa"), equalTo("a*a*a*a"));
    }

    @Test
    public void countHi2ReturnsCorrectValue() {
        assertThat(Recursion1.countHi2("ahixhi"), equalTo(1));
        assertThat(Recursion1.countHi2("ahibhi"), equalTo(2));
        assertThat(Recursion1.countHi2("xhixhi"), equalTo(0));
        assertThat(Recursion1.countHi2("xxxx"), equalTo(0));
    }

    @Test
    public void parenBitReturnsCorrectValue() {
        assertThat(Recursion1.parenBit("xyz(abc)123"), equalTo("(abc)"));
        assertThat(Recursion1.parenBit("x(hello)"), equalTo("(hello)"));
        assertThat(Recursion1.parenBit("(xy)1"), equalTo("(xy)"));
    }

    @Test
    public void nestParenReturnsCorrectBoolean() {
        assertTrue(Recursion1.nestParen("(())"));
        assertTrue(Recursion1.nestParen("((()))"));
        assertFalse(Recursion1.nestParen("(((x))"));
    }

}


