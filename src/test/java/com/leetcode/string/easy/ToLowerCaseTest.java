package com.leetcode.string.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ToLowerCaseTest {

    @Test
    void test1() {
        String s = "Hello";

        String lowerCase = ToLowerCase.toLowerCase(s);

        Assertions.assertEquals("hello", lowerCase);
    }
}
