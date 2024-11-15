package com.leetcode.array.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShuffleTheArrayTest {

    @Test
    void test1() {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] expect = {2, 3, 5, 4, 1, 7};

        int[] shuffle = ShuffleTheArray.shuffle(nums, n);

        for (int i = 0; i < shuffle.length; i++) {
            Assertions.assertEquals(expect[i], shuffle[i]);
        }
    }
}
