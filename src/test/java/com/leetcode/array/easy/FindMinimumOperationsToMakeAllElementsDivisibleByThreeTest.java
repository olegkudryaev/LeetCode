package com.leetcode.array.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindMinimumOperationsToMakeAllElementsDivisibleByThreeTest {

    @Test
    void test1() {
        int[] nums = {1, 2, 3, 4};
        int expected = 3;

        int i = FindMinimumOperationsToMakeAllElementsDivisibleByThree.minimumOperations(nums);

        Assertions.assertEquals(expected, i);
    }

    @Test
    void test2() {
        int[] nums = {3,6,9};
        int expected = 0;

        int i = FindMinimumOperationsToMakeAllElementsDivisibleByThree.minimumOperations(nums);

        Assertions.assertEquals(expected, i);
    }
}
