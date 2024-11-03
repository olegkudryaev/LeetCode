package com.leetcode.array.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BuildArrayFromPermutationTest {

    @Test
    void test1() {
        int[] nums = {0, 2, 1, 5, 3, 4};
        int[] expect = {0,1,2,4,5,3};

        int[] ints = BuildArrayFromPermutation.buildArray(nums);

        for (int i = 0; i < ints.length; i++) {
            Assertions.assertEquals(expect[i], ints[i]);
        }

    }
}
