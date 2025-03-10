package com.leetcode.array.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RearrangeArrayElementsBySignTest {

    @Test
    void test() {
        int[] nums = {3, 1, -2, -5, 2, -4};
        int[] exp = {3, -2, 1, -5, 2, -4};

        int[] ints = RearrangeArrayElementsBySign.rearrangeArray(nums);

        for (int i = 0; i < ints.length; i++) {
            Assertions.assertEquals(ints[i], exp[i]);
        }
    }
}
