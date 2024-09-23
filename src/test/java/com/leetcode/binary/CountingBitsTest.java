package com.leetcode.binary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

class CountingBitsTest {

    @InjectMocks
    private CountingBits countingBits;

    @Test
    void test1() {
        int num = 5;
        int[] nums = {0, 1, 1, 2, 1, 2};

        int[] ints = CountingBits.countBits(num);

        for (int i = 0; i < nums.length; i++) {
            Assertions.assertEquals(nums[i], ints[i]);
        }
    }
}
