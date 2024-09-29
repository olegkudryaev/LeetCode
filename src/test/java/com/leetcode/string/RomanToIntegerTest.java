package com.leetcode.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RomanToIntegerTest {

    @Test
    void test1() {
        String test = "III";

        int i = RomanToInteger.romanToInt(test);

        Assertions.assertEquals(3, i);
    }

    @Test
    void test2() {
        String test = "LVIII";

        int i = RomanToInteger.romanToInt(test);

        Assertions.assertEquals(58, i);
    }

    @Test
    void test3() {
        String test = "MCMXCIV";

        int i = RomanToInteger.romanToInt(test);

        Assertions.assertEquals(1994, i);
    }
}
