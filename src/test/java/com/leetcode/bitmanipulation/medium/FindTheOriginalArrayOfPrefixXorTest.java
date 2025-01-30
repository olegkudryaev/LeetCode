package com.leetcode.bitmanipulation.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindTheOriginalArrayOfPrefixXorTest {
    @Test
    void test() {
        int[] nums = {5, 2, 0, 3, 1};
        int[] exp = {5, 7, 2, 3, 2};

        int[] array = FindTheOriginalArrayOfPrefixXor.findArray(nums);

        for (int i = 0; i < array.length; i++) {
            Assertions.assertEquals(exp[i], array[i]);
        }
    }
}
