package com.leetcode.array.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LargestLocalValuesInMatrixTest {

    @Test
    void test1() {
        int[][] nums = {{9, 9, 8, 1}, {5, 6, 2, 5}, {8, 2, 6, 4}, {6, 2, 2, 2}};

        int[][] expected = {{9, 9}, {8, 2}};

        int[][] ints = LargestLocalValuesInMatrix.largestLocal(nums);

        Assertions.assertEquals(expected, ints);
    }
}
