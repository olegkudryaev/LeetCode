package com.leetcode.backtracking.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumOfAllSubsetXORTotalsTest {
    @Test
    void test() {
            int[] nums = {5,1,6};
        int exp = 28;

        int i = SumOfAllSubsetXORTotals.subsetXORSum(nums);

        Assertions.assertEquals(exp, i);
    }
}
