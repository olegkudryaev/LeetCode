package com.leetcode.array.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumProductDifferenceBetweenTwoPairsTest {
    @Test
    void test() {
        int[] nums = {5,6,2,7,4};
        int exp = 34;

        int i = MaximumProductDifferenceBetweenTwoPairs.maxProductDifference(nums);

        Assertions.assertEquals(exp, i);
    }
}
