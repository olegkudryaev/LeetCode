package com.leetcode.array.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxIncreaseToKeepCitySkylineTest {
    @Test
    void test() {
        int[][] grid = {{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}};

        int output = 35;

        int i = MaxIncreaseToKeepCitySkyline.maxIncreaseKeepingSkyline(grid);

        Assertions.assertEquals(output, i);
    }
}
