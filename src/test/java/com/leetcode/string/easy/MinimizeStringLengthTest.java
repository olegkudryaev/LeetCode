package com.leetcode.string.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinimizeStringLengthTest {

    @Test
    void test1() {

        String s = "aaabc";

        int i = MinimizeStringLength.minimizedStringLength(s);

        Assertions.assertEquals(3, i);
    }
}
