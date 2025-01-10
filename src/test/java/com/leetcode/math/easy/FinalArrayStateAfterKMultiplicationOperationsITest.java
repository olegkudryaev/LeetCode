package com.leetcode.math.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FinalArrayStateAfterKMultiplicationOperationsITest {

    @Test
    void test1() {
        int[] nums = {2, 1, 3, 5, 6};
        int k = 5, multiplier = 2;
        int[] exp = {8, 4, 6, 5, 6};
        int[] nums1 = FinalArrayStateAfterKMultiplicationOperationsI.getFinalState(nums, k, multiplier);

        for (int i = 0; i < exp.length; i++) {
            Assertions.assertEquals(exp[i], nums1[i]);
        }
    }
}
