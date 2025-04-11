package com.leetcode.array.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumOfVariableLengthSubarraysTest {
    @Test
    void test() {
        int[] nums = {3,1,1,2};
        int exp = 13;

        int i = SumOfVariableLengthSubarrays.subarraySum(nums);

        Assertions.assertEquals(exp, i);
    }
}
