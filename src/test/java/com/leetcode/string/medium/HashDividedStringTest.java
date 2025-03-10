package com.leetcode.string.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HashDividedStringTest {

    @Test
    void test() {
        String s = "abcd";
        int k = 2;

        String expected = "bf";

        String s1 = HashDividedString.stringHash(s, k);
        Assertions.assertEquals(expected, s1);
    }
}
