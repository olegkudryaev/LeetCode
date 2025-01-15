package com.leetcode.binary.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumBitFlipsToConvertNumberTest {
    @Test
    void testMinimumBitFlipsToConvertNumber() {
        int start = 10, goal = 7;
        int expected = 3;

        int i = MinimumBitFlipsToConvertNumber.minBitFlips(start, goal);
        Assertions.assertEquals(expected, i);
    }
}
