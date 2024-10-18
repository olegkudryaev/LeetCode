package com.leetcode.string.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberOfPairsOfStringsWithConcatenationEqualToTargetTest {

    @Test
    void test1() {
        String[] nums = {"123","4","12","34"};
        String target = "1234";

        int expected = 2;

        int i = NumberOfPairsOfStringsWithConcatenationEqualToTarget.numOfPairs(nums, target);

        Assertions.assertEquals(expected, i);
    }
}
