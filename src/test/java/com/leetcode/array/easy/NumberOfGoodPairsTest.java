package com.leetcode.array.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfGoodPairsTest {
    @Test
    void test1() {
        int[] nums = {1, 2, 3, 1, 1, 3};
        int expect = 4;
        int i = NumberOfGoodPairs.numIdenticalPairs(nums);
        Assertions.assertEquals(expect, i);
    }
}
