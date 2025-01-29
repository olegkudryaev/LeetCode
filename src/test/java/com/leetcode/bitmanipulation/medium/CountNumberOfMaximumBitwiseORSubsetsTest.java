package com.leetcode.bitmanipulation.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountNumberOfMaximumBitwiseORSubsetsTest {

    @Test
    void test() {
        int[] nums = {3,2,1,5};
        int n = 6;

        int i = CountNumberOfMaximumBitwiseORSubsets.countMaxOrSubsets(nums);

        Assertions.assertEquals(n, i);
    }
}
