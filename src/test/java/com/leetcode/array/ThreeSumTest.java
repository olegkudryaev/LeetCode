package com.leetcode.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import java.util.List;

class ThreeSumTest {

    @InjectMocks
    private ThreeSum threeSum;

    @Test
    void test1() {
        int[] nums = {-4, -1, -1, 0, 1, 2};
        //{-4, -1, -1, 0, 1, 2}
        List<Integer> expect1 = List.of(-1, 0, 1);
        List<Integer> expect2 = List.of(-1, -1, 2);
        List<List<Integer>> expect = List.of(expect2, expect1);
        List<List<Integer>> result = threeSum.threeSum(nums);

        Assertions.assertEquals(expect, result);
    }
}
