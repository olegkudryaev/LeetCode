package com.leetcode.string.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RingsAndRodsTest {

    @Test
    void test1() {
        String rings = "B0B6G0R6R0R6G9";

        int i = RingsAndRods.countPoints(rings);

        Assertions.assertEquals(1, i);
    }
}
