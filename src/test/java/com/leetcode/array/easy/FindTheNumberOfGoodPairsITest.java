package com.leetcode.array.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindTheNumberOfGoodPairsITest {

    @Test
    void test1() {
        int[] nums1 = {1, 3, 4};
        int[] nums2 = {1, 3, 4};

        int k = 1;

        int expected = 5;

        int i = FindTheNumberOfGoodPairsI.numberOfPairs(nums1, nums2, k);

        Assertions.assertEquals(expected, i);
    }
}
