package com.leetcode.array.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeftAndRightSumDifferencesTest {

    @Test
    void test() {
        int[] nums = {10, 4, 8, 3};
        int[] exp = {15, 1, 11, 22};
        int[] ints = LeftAndRightSumDifferences.leftRightDifference(nums);
        for (int i = 0; i < ints.length; i++) {
            Assertions.assertEquals(exp[i], ints[i]);
        }
    }
}
