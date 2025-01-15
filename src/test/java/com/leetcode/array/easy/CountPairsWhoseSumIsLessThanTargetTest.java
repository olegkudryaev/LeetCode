package com.leetcode.array.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class CountPairsWhoseSumIsLessThanTargetTest {
    @Test
    void countPairsWhoseSumIsLessThanTarget() {
        List<Integer> nums = Arrays.asList(-1, 1, 2, 3, 1);
        int target = 2;
        int expected = 3;

        int i = CountPairsWhoseSumIsLessThanTarget.countPairs(nums, target);

        Assertions.assertEquals(expected, i);
    }
}
