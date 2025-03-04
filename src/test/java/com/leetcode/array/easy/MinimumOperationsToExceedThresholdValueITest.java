package com.leetcode.array.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumOperationsToExceedThresholdValueITest {
    @Test
    void test() {
        int[] nums = {2, 11, 10, 1, 3};
        int k = 10;

        int exp = 3;

        int i = MinimumOperationsToExceedThresholdValueI.minOperations(nums, k);

        Assertions.assertEquals(exp, i);
    }
}
